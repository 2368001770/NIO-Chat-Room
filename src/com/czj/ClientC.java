package com.czj;

import java.io.IOException;

public class ClientC {
    public static void main(String[] args) throws IOException {
        new NioClient().start("clientC");
    }
}
