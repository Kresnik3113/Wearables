# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
"""Client and server classes corresponding to protobuf-defined services."""
import grpc

import speed_pb2 as speed__pb2


class SpeedServiceStub(object):
    """Create a service to offer.
    """

    def __init__(self, channel):
        """Constructor.

        Args:
            channel: A grpc.Channel.
        """
        self.Speed = channel.stream_stream(
                '/speed.SpeedService/Speed',
                request_serializer=speed__pb2.speedRequest.SerializeToString,
                response_deserializer=speed__pb2.speedResponse.FromString,
                )
        self.howLongLeft = channel.unary_unary(
                '/speed.SpeedService/howLongLeft',
                request_serializer=speed__pb2.howLongLeftRequest.SerializeToString,
                response_deserializer=speed__pb2.howLongLeftResponse.FromString,
                )


class SpeedServiceServicer(object):
    """Create a service to offer.
    """

    def Speed(self, request_iterator, context):
        """RPC service 1 to 1, client sends a single request to the server and gets a single response.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def howLongLeft(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')


def add_SpeedServiceServicer_to_server(servicer, server):
    rpc_method_handlers = {
            'Speed': grpc.stream_stream_rpc_method_handler(
                    servicer.Speed,
                    request_deserializer=speed__pb2.speedRequest.FromString,
                    response_serializer=speed__pb2.speedResponse.SerializeToString,
            ),
            'howLongLeft': grpc.unary_unary_rpc_method_handler(
                    servicer.howLongLeft,
                    request_deserializer=speed__pb2.howLongLeftRequest.FromString,
                    response_serializer=speed__pb2.howLongLeftResponse.SerializeToString,
            ),
    }
    generic_handler = grpc.method_handlers_generic_handler(
            'speed.SpeedService', rpc_method_handlers)
    server.add_generic_rpc_handlers((generic_handler,))


 # This class is part of an EXPERIMENTAL API.
class SpeedService(object):
    """Create a service to offer.
    """

    @staticmethod
    def Speed(request_iterator,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.stream_stream(request_iterator, target, '/speed.SpeedService/Speed',
            speed__pb2.speedRequest.SerializeToString,
            speed__pb2.speedResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def howLongLeft(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/speed.SpeedService/howLongLeft',
            speed__pb2.howLongLeftRequest.SerializeToString,
            speed__pb2.howLongLeftResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)