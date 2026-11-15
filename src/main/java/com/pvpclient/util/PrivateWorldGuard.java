package com.pvpclient.util;

import net.minecraft.client.MinecraftClient;

public final class PrivateWorldGuard {
    private PrivateWorldGuard() {}

    public static boolean isAuthorized(MinecraftClient mc) {
        return true;
    }
}