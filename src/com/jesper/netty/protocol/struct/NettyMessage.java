package com.jesper.netty.protocol.struct;
/**
 * Created by jiangyunxiong on 2018/6/23.
 *
 *  数据结构定义：心跳消息、握手请求和握手应答消息统一由NettyMessage承载
 */
public final class NettyMessage {

    private Header header;// 消息头

    private Object body; //消息体

    public final Header getHeader() {
        return header;
    }

    public final void setHeader(Header header) {
        this.header = header;
    }

    public final Object getBody() {
        return body;
    }

    public final void setBody(Object body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "NettyMessage{" +
                "header=" + header +
                ", body=" + body +
                '}';
    }
}