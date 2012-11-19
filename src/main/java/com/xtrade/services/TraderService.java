package com.xtrade.services;

import com.xtrade.entity.Trader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.*;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.Response;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;



import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

@Path("/trader")
public class TraderService {

final Logger logger = LoggerFactory.getLogger(TraderService.class);


@GET
@Consumes(value = {APPLICATION_JSON})
@Produces(value = {APPLICATION_JSON})
public Response list(){

    List<Trader> traders=new ArrayList<Trader>();
    logger.info("Listing traders");
    for(int i=0;i<100;i++){
        Trader trader =new Trader();
        trader.name = "Trader #"+i;
        trader.address="Address #"+i;
        trader.website=String.format("http://website#%d.com",i);
        traders.add(trader);
    }

    GenericEntity<List<Trader>> traderList=new GenericEntity<List<Trader>>(traders){};

	return Response.ok(traders.toArray( traders.toArray(new Trader[traders.size()]))).build();
}

    @POST
    @Path("/{trader_id}/")
    @Consumes(value = {APPLICATION_JSON})
    @Produces(value = {APPLICATION_JSON})

    public Response post(@PathParam("trader_id") String traderId){
        logger.info("Adding trader");
        URI location=URI.create("http://localhost/#1");

        return Response.created(location).build();
    }

    @DELETE
    @Consumes(value = {APPLICATION_JSON})
    @Produces(value = {APPLICATION_JSON})
    public Response delete(){

        return Response.ok().build();
    }




}
