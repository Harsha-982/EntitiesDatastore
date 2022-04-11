package com.example.NextTrail;

import java.io.*;
import javax.jdo.PersistenceManager;
import javax.servlet.http.*;

public class HelloServlet extends HttpServlet implements Serializable{

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{

        PMF pmf= new PMF();
        PersistenceManager pm = pmf.get().getPersistenceManager();
        Entries entries=new Entries("Harsha","Togaru");
        try {
            pm.makePersistent(entries);
        } finally {
            pm.close();
        }
        response.getWriter().println("Hello");
    }

}