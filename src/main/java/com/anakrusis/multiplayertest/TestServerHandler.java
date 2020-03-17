package com.anakrusis.multiplayertest;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

public class TestServerHandler extends ChannelInboundHandlerAdapter {

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) { // (2)
        // Discard the received data silently.
        ((ByteBuf) msg).release(); // (3)
    }

    @Override
    public void channelActive(ChannelHandlerContext ctx) {
        System.out.println("Channel active");
        Entity e = new Entity(0, 0, 0, TestServer.testServer.world);
        TestServer.testServer.world.getEntities().put(e.getUuid(), e);

        ctx.writeAndFlush(TestServer.testServer.world);
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) { // (4)
        // Close the connection when an exception is raised.
        cause.printStackTrace();
        ctx.close();
    }
}
