package com.example;

import java.net.InetAddress;
import java.net.Socket;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String args[])
    {
        ClientStr cliente = new ClientStr();
        cliente.connetti();
        cliente.comunica();
    }

}
 