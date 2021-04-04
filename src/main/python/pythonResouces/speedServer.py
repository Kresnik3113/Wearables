"""The Python implementation of the GRPC helloworld.Greeter server."""

import logging
import socket
from concurrent import futures

import grpc
from zeroconf import ServiceInfo, Zeroconf

from src.main.python.pythonResouces import speed_pb2_grpc, speed_pb2

speed = 10;


class SpeedServiceServicer(speed_pb2_grpc.SpeedServiceServicer):

    def howLongLeft(self, request, context):
        distanceLeft = request.getDistanceLeft;
        time = distanceLeft / speed;

        return speed_pb2.howLongLeftResponse(time=time)

    def speed(self, request, context):
        speed = request.speed

        return speed_pb2.speedResponse(speed=speed)


def serve():
    server = grpc.server(futures.ThreadPoolExecutor(max_workers=10))
    speed_pb2_grpc.add_SpeedServiceServicer_to_server(
        SpeedServiceServicer(), server)
    # orders = []
    print("Started")

    server.add_insecure_port('[::]:51209')
    server.start()
    server.wait_for_termination()


def register():
    global zeroconf
    desc = {'path': 'order.properties'}

    info = ServiceInfo(
        "_order._tcp.local.",
        "order_products._order._tcp.local.",
        addresses=[socket.inet_aton("192.168.0.91")],
        port=51209,
        properties=desc,
        server="_order._tcp.local.",
    )
    zeroconf = Zeroconf()
    zeroconf.register_service(info)
    print('\nServer registered!')
    print("Server: " + str(info.server))
    print("Port: " + str(info.port))
    print("Description: " + str(desc))


if __name__ == '__main__':
    logging.basicConfig()
    register()
    serve()
