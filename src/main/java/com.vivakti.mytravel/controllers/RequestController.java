package com.vivakti.mytravel.controllers;

import com.vivakti.mytravel.models.Request;
import com.vivakti.mytravel.models.RequestDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;
import java.util.Date;


@RestController
public class RequestController {
    
    @Autowired
    private RequestDao requestDao;
    
    @CrossOrigin(origins = "*")  
    @RequestMapping("/travelrequest/create")
    public String create(String source, String destination,int numberOfPassengers,String description) {
        System.out.println("Inside create request");
        Request request= null;
        try {
          
          request = new Request();
          
          request.setSource(source);
          request.setDestination(destination);
          request.setDescription(description);
          request.setNumberOfPassengers(numberOfPassengers);
          request.setFromDate(new Date(System.currentTimeMillis()));
          request.setToDate(new Date(System.currentTimeMillis()));
          request.setStatus(1);
          
          requestDao.save(request);
        }
        catch (Exception ex) {
          return "Error creating the user: " + ex.toString();
        }
        return "User succesfully created! (id = " + request.getId() + ")";
            
    }
    
    
    @CrossOrigin(origins = "*")  
    @RequestMapping(value="/travelrequest", method=RequestMethod.POST)
    public Request create( @RequestBody Request request) {
        System.out.println("Inside create request");
        try {
          
          System.out.println("RequestId:"+request.getId());
          if(request.getId()==null) {
            System.out.println("create");
            request.setStatus(1);
            requestDao.save(request);
          }else
          {
            System.out.println("update");
            requestDao.save(request);
          }

        }
        catch (Exception ex) {
          System.out.println( "Error creating the user: " + ex.toString());
          ex.printStackTrace();
        }
        return request;
            
    }
    
    
    
    @CrossOrigin(origins = "*")  
    @RequestMapping(value="/travelrequest", method = RequestMethod.GET)
    public Request getRequest (Long id) {
        Request request = null;
        try {
            request = requestDao.findOne(id);
        }catch (Exception ex) {
          System.out.println( "Error retrieving request : " + ex.toString());
          return request;
        }
        return request;
    }
    
}
