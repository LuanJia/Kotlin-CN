package tech.kotlin.model.request

import com.baidu.bjf.remoting.protobuf.FieldType
import com.baidu.bjf.remoting.protobuf.annotation.Protobuf
import tech.kotlin.model.domain.Device

class CreateSessionReq {

    @Protobuf(order = 1, required = true, fieldType = FieldType.OBJECT, description = "创建会话")
    var device: Device = Device()

    @Protobuf(order = 2, required = true, fieldType = FieldType.UINT64, description = "账号")
    var uid: Long = 0

}