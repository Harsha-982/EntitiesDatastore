package com.example.Entity8_1;

import com.google.appengine.api.datastore.*;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/hello-servlet")
public class HelloServlet extends HttpServlet {
    public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {

        PrintWriter out = response.getWriter();

        DatastoreService datastoreService= DatastoreServiceFactory.getDatastoreService();
        Entity entity =new Entity("Togaru","516");
        entity.setProperty("firstName","Usha");
        entity.setProperty("lastName","Togaru");
        entity.setProperty("highestDegree","M.Tech");

        datastoreService.put(entity);

        //retrive complete entity
        Key key = KeyFactory.createKey("Togaru","402");
        out.println(key); //Togaru("402")

        try {
            Entity entity1= datastoreService.get(key);
            response.getWriter().println(entity1);
            System.out.println(entity1);
        } catch (EntityNotFoundException e) {
            e.printStackTrace();
        }
//        Query query= new Query("Togaru").addSort("highestDegree", Query.SortDirection.DESCENDING);
        Query query = new Query("Togaru");
        PreparedQuery preparedQuery=datastoreService.prepare(query);
        out.println(preparedQuery+" : "+query);
        for(Entity e : preparedQuery.asIterable()){
            out.println(e);
            String s=e.getProperty("highestDegree").toString();
            out.println("<li>"+s+"</li>");
////
        }
    }
}