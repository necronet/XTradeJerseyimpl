package com.xtrade.services;

import com.xtrade.entity.Trader;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

@Path("/trader")
public class TraderService {



@GET
public List list(){

    List<Trader> traders=new ArrayList<Trader>();

    for(int i=0;i<100;i++){
        Trader trader =new Trader();
        trader.name = "Trader #"+i;
        trader.address="Address #"+i;
        trader.website=String.format("http://website#%d.com",i);
        traders.add(trader);
    }

	return traders;
}

}
