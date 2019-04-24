package com.czj;

import java.io.IOException;

public class ClientB {
    public static void main(String[] args) throws IOException {
        new NioClient().start("clientB");
    }
}
