# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: speed.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()




DESCRIPTOR = _descriptor.FileDescriptor(
  name='speed.proto',
  package='speed',
  syntax='proto3',
  serialized_options=b'\n\020ds.project.speedB\020SpeedServiceImplP\001',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n\x0bspeed.proto\x12\x05speed\"%\n\x0cspeedRequest\x12\x15\n\rcurrent_speed\x18\x01 \x01(\x05\"&\n\rspeedResponse\x12\x15\n\rcurrent_speed\x18\x01 \x01(\x05\"*\n\x12howLongLeftRequest\x12\x14\n\x0c\x64istanceLeft\x18\x01 \x01(\x05\"\'\n\x13howLongLeftResponse\x12\x10\n\x08timeLeft\x18\x01 \x01(\x05\x32\x90\x01\n\x0cSpeedService\x12\x38\n\x05Speed\x12\x13.speed.speedRequest\x1a\x14.speed.speedResponse\"\x00(\x01\x30\x01\x12\x46\n\x0bhowLongLeft\x12\x19.speed.howLongLeftRequest\x1a\x1a.speed.howLongLeftResponse\"\x00\x42&\n\x10\x64s.project.speedB\x10SpeedServiceImplP\x01\x62\x06proto3'
)




_SPEEDREQUEST = _descriptor.Descriptor(
  name='speedRequest',
  full_name='speed.speedRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='current_speed', full_name='speed.speedRequest.current_speed', index=0,
      number=1, type=5, cpp_type=1, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=22,
  serialized_end=59,
)


_SPEEDRESPONSE = _descriptor.Descriptor(
  name='speedResponse',
  full_name='speed.speedResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='current_speed', full_name='speed.speedResponse.current_speed', index=0,
      number=1, type=5, cpp_type=1, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=61,
  serialized_end=99,
)


_HOWLONGLEFTREQUEST = _descriptor.Descriptor(
  name='howLongLeftRequest',
  full_name='speed.howLongLeftRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='distanceLeft', full_name='speed.howLongLeftRequest.distanceLeft', index=0,
      number=1, type=5, cpp_type=1, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=101,
  serialized_end=143,
)


_HOWLONGLEFTRESPONSE = _descriptor.Descriptor(
  name='howLongLeftResponse',
  full_name='speed.howLongLeftResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='timeLeft', full_name='speed.howLongLeftResponse.timeLeft', index=0,
      number=1, type=5, cpp_type=1, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=145,
  serialized_end=184,
)

DESCRIPTOR.message_types_by_name['speedRequest'] = _SPEEDREQUEST
DESCRIPTOR.message_types_by_name['speedResponse'] = _SPEEDRESPONSE
DESCRIPTOR.message_types_by_name['howLongLeftRequest'] = _HOWLONGLEFTREQUEST
DESCRIPTOR.message_types_by_name['howLongLeftResponse'] = _HOWLONGLEFTRESPONSE
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

speedRequest = _reflection.GeneratedProtocolMessageType('speedRequest', (_message.Message,), {
  'DESCRIPTOR' : _SPEEDREQUEST,
  '__module__' : 'speed_pb2'
  # @@protoc_insertion_point(class_scope:speed.speedRequest)
  })
_sym_db.RegisterMessage(speedRequest)

speedResponse = _reflection.GeneratedProtocolMessageType('speedResponse', (_message.Message,), {
  'DESCRIPTOR' : _SPEEDRESPONSE,
  '__module__' : 'speed_pb2'
  # @@protoc_insertion_point(class_scope:speed.speedResponse)
  })
_sym_db.RegisterMessage(speedResponse)

howLongLeftRequest = _reflection.GeneratedProtocolMessageType('howLongLeftRequest', (_message.Message,), {
  'DESCRIPTOR' : _HOWLONGLEFTREQUEST,
  '__module__' : 'speed_pb2'
  # @@protoc_insertion_point(class_scope:speed.howLongLeftRequest)
  })
_sym_db.RegisterMessage(howLongLeftRequest)

howLongLeftResponse = _reflection.GeneratedProtocolMessageType('howLongLeftResponse', (_message.Message,), {
  'DESCRIPTOR' : _HOWLONGLEFTRESPONSE,
  '__module__' : 'speed_pb2'
  # @@protoc_insertion_point(class_scope:speed.howLongLeftResponse)
  })
_sym_db.RegisterMessage(howLongLeftResponse)


DESCRIPTOR._options = None

_SPEEDSERVICE = _descriptor.ServiceDescriptor(
  name='SpeedService',
  full_name='speed.SpeedService',
  file=DESCRIPTOR,
  index=0,
  serialized_options=None,
  create_key=_descriptor._internal_create_key,
  serialized_start=187,
  serialized_end=331,
  methods=[
  _descriptor.MethodDescriptor(
    name='Speed',
    full_name='speed.SpeedService.Speed',
    index=0,
    containing_service=None,
    input_type=_SPEEDREQUEST,
    output_type=_SPEEDRESPONSE,
    serialized_options=None,
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='howLongLeft',
    full_name='speed.SpeedService.howLongLeft',
    index=1,
    containing_service=None,
    input_type=_HOWLONGLEFTREQUEST,
    output_type=_HOWLONGLEFTRESPONSE,
    serialized_options=None,
    create_key=_descriptor._internal_create_key,
  ),
])
_sym_db.RegisterServiceDescriptor(_SPEEDSERVICE)

DESCRIPTOR.services_by_name['SpeedService'] = _SPEEDSERVICE

# @@protoc_insertion_point(module_scope)
