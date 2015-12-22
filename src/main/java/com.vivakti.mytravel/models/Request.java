package com.vivakti.mytravel.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table; 
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "Request")
public class Request {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @NotNull
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy") 
    private Date fromDate;
  
    @NotNull
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy") 
    private Date toDate;
    
    
    @NotNull
    private int numberOfPassengers;
    
    @NotNull
    @Size(min=2, max=50)
    private String source;
    
    @NotNull
    @Size(min=2, max=50)
    private String destination;
    
    @Size(max=50)
    private String sourceCordinates;
    
    @Size(max=50)
    private String destinationCordinates;
    
    @Size(max=500)   
    private String description;
    
    
    private Integer distance;
    private Boolean roundTripFlag;
    
    @NotNull
    private int status;
    
    
    public Long getId(){
        return this.id;
    }
    public void setId(Long id) {
        this.id=id;
    }
   
    //@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy") 
    public Date getfromDate() {
        return this.fromDate;
    }
    //@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy") 
    public void setFromDate(Date fromDate){
        this.fromDate=fromDate;
    }

    //@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")   
    public Date getToDate() {
        return toDate;
    }
    //@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy") 
    public void setToDate(Date toDate){
        this.toDate=toDate;
    }
    
    public int getNumberOfPassengers(){
        return this.numberOfPassengers;
    }
    public void setNumberOfPassengers(int numberOfPassengers){
        this.numberOfPassengers=numberOfPassengers;
    }
    
    public String getSource() {
        return this.source;
    }
    public void setSource(String source){
        this.source=source;
    }
    
    public String getDestination() {
        return this.destination;
    }
    public void setDestination(String destination){
        this.destination=destination;
    }
    
    public String getSourceCordinates() {
        return this.sourceCordinates;
    }
    public void setSourceCordinates(String sourceCordinates){
        this.sourceCordinates=sourceCordinates;
    }
    
    public String getDestinationCordinates() {
        return this.destinationCordinates;
    }
    public void setDestinationCordinates(String destinationCordinates){
        this.destinationCordinates=destinationCordinates;
    }
    
    public String getDescription() {
        return this.description;
    }
    public void setDescription(String description){
        this.description=description;
    }
    
    
    public int getDistance() {
        return this.distance;
    }
    public void setDistance(int distance){
        this.distance=distance;
    }
    public int getRoundTripFlag() {
        return this.roundTripFlag;
    }
    public void setRoundTripFlag(Boolean roundTripFlag){
        this.roundTripFlag=roundTripFlag;
    }
    
    
    
    public int getStatus() {
        return this.status;
    }
    public void setStatus(int status){
        this.status=status;
    }
    
    
}
    
    
    
    
    
    