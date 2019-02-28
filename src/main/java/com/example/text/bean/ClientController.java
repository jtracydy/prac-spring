/*
*  2019 
*/
package com.example.text.bean;

import com.example.text.bean.static_factory.FactoryDao;
import com.example.text.bean.static_factory.FactoryService;

/**
 * @author wangdan Date: 2019/2/27 Time: 20:02
 * @version $Id$
 */

public class ClientController {

    private ClientService clientService;

    private ClientConstruct clientConstruct;

    private FactoryDao factoryDao;

    private FactoryService factoryService;

    /**
     * DI的两种方式
     * @param clientService
     */

    public void setClientService(ClientService clientService){
        this.clientService = clientService;
    }

    public ClientController(ClientConstruct clientConstruct){
        this.clientConstruct = clientConstruct;
    }

    public void setFactoryDao(FactoryDao factoryDao){
        this.factoryDao = factoryDao;
    }

    public void setFactoryService(FactoryService factoryService){
        this.factoryService = factoryService;
    }

    public void testSet(){
        clientService.get();
    }

    public void testCon(){
        clientConstruct.get();
    }

    public void testStaticFactory(){
        factoryDao.get();
    }

    public void testFactoryService(){
        factoryService.get();
    }
}