/*
 * Javalin - https://javalin.io
 * Copyright 2017 David Åse
 * Licensed under Apache 2.0: https://github.com/tipsy/javalin/blob/master/LICENSE
 */

package io.javalin.embeddedserver.jetty.websocket.interfaces;

import org.eclipse.jetty.websocket.api.Session;

@FunctionalInterface
public interface MessageHandler {
    void handle(Session session, String msg) throws Exception;
}
