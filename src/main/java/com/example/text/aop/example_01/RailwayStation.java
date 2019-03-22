/*
*  2019 
*/
package com.example.text.aop.example_01;


/**
 * RailwayStation 实现 TicketService
 */
public class RailwayStation implements TicketService {

    @Override
    public void sellTicket() {
        System.out.println("售票............");
    }

    @Override
    public void inquire() {
        System.out.println("问询.............");
    }

    @Override
    public void withdraw() {
        System.out.println("退票.............");
    }
}