package com.siebel.local.repositoryworkflowdefinitionexportv.7.7.2;


/* 
 * -- AUTOMATICALLY GENERATED FROM SIEBEL TOOLS -- 
 * Copyright (C) 2000, Siebel Systems Incorporated, All rights reserved. 
 * 
 * MODIFICATION OR EXTENSION OF THIS CODE SHALL VOID ANY APPLICABLE 
 * WARRANTIES AND MAINTENANCE SUPPORT.
 * 
 * Generated from Siebel Java (JDB) Code Generator 
 * Repository        : Siebel Repository 
 * Generated Date    : Thu Aug 25 15:02:29 2011
 */


/* import classes we need. */ 
import java.io.Serializable;  
import java.util.Vector; 
import java.util.Enumeration; 

import com.siebel.data.SiebelException; 
import com.siebel.data.SiebelExceptionConstants; 
import com.siebel.data.SiebelPropertySet; 
import com.siebel.data.SiebelDataBean; 

import com.siebel.integration.util.SiebelHierarchy; 
import com.siebel.integration.util.SiebelHierarchyImpl; 
import com.siebel.integration.adapter.SiebelJDBAdapterBase;



/**
 * Repository Workflow Process 
 * 
 * Generated from Siebel Java (JDB) Code Generator 
 * @author Siebel Systems, Inc. 
 * @see Siebel Code Generator 
 **/ 

public    class Repository_Workflow_Definition_Export_V.7.7.2IO implements  Serializable, Cloneable, SiebelHierarchy {
  /* class level properties */
  public    static final String  SIEBEL_REPOSITORY  = "Siebel Repository";
  public    static final String  SIEBEL_VERSION     = "";

  public    static final String  CLASS_PROPERTY     = "SiebelMessage";
  public    static final boolean USING_LIST         = true;
  public    static final boolean PS_TYPE_REQUIRED   = true;

  /* Field Level Properties */
  protected static final String  FINTOBJECTFORMAT_PROPERTY  =  "IntObjectFormat";
  protected static final String  FMESSAGETYPE_PROPERTY  =  "MessageType";
  protected static final String  FMESSAGEID_PROPERTY  =  "MessageId";
  protected static final String  FINTOBJECTNAME_PROPERTY  =  "IntObjectName";
  protected static final String  FOUTPUTINTOBJECTNAME_PROPERTY  =  "OutputIntObjectName";
  protected static final String  FINTOBJINST_PROPERTY  =  "Repository Workflow Definition Export V.7.7.2";

  /* default constructor */ 
  public Repository_Workflow_Definition_Export_V.7.7.2IO()  { 
    super(); 
  }/* public Repository_Workflow_Definition_Export_V.7.7.2IO(...) */ 

 
  /* constructor from a Siebel Property Set */ 
  public Repository_Workflow_Definition_Export_V.7.7.2IO(SiebelPropertySet ps) throws SiebelException { 
    super(); 
    fromPropertySet(ps);  
  }/* public Repository_Workflow_Definition_Export_V.7.7.2IO(...) */     


  public int hashCode() {
    int HASH_PRIME = 51;
    int hash       =  0;

    if(fIntObjectFormat != null) {
      hash = HASH_PRIME * hash + fIntObjectFormat.hashCode(); 
    }/* if */

    if(fMessageType != null) {
      hash = HASH_PRIME * hash + fMessageType.hashCode(); 
    }/* if */

    if(fMessageId != null) {
      hash = HASH_PRIME * hash + fMessageId.hashCode(); 
    }/* if */

    if(fIntObjectName != null) {
      hash = HASH_PRIME * hash + fIntObjectName.hashCode(); 
    }/* if */

    if(fOutputIntObjectName != null) {
      hash = HASH_PRIME * hash + fOutputIntObjectName.hashCode(); 
    }/* if */

    if(fintObjInst != null) {
      for(int i = 0; i < fintObjInst.size(); ++i) { 
        Repository_Workflow_ProcessIC  tmp = (Repository_Workflow_ProcessIC)fintObjInst.get(i); 

        hash = HASH_PRIME * hash + tmp.hashCode(); 
      }/* for */ 
    }/* if */ 

    return hash;
  }/* public int hashCode(...) */


  public boolean equals(Object object) {
    if(this == object) return true;
    if(object == null) return false;
    if(object.getClass() != getClass()) return false;
    Repository_Workflow_Definition_Export_V.7.7.2IO o = (Repository_Workflow_Definition_Export_V.7.7.2IO)object;

    if(fIntObjectFormat == null) { 
       if(o.fIntObjectFormat != null) return false; 
    }else if(! fIntObjectFormat.equals(o.fIntObjectFormat)) return false; 

    if(fMessageType == null) { 
       if(o.fMessageType != null) return false; 
    }else if(! fMessageType.equals(o.fMessageType)) return false; 

    if(fMessageId == null) { 
       if(o.fMessageId != null) return false; 
    }else if(! fMessageId.equals(o.fMessageId)) return false; 

    if(fIntObjectName == null) { 
       if(o.fIntObjectName != null) return false; 
    }else if(! fIntObjectName.equals(o.fIntObjectName)) return false; 

    if(fOutputIntObjectName == null) { 
       if(o.fOutputIntObjectName != null) return false; 
    }else if(! fOutputIntObjectName.equals(o.fOutputIntObjectName)) return false; 

    if((fintObjInst != null) && (o.fintObjInst != null)) { 
      if(fintObjInst.size() != o.fintObjInst.size()) return false; 

      for(int i = 0; i < fintObjInst.size(); ++i) { 
         if(! fintObjInst.get(i).equals(o.fintObjInst.get(i)))   
           return false;  
      }/* for */  
    }else{
      if(fintObjInst != o.fintObjInst) return false;
    }/* if */

    return true;
  }/* public int equals(...) */


  public Object clone() {
    try {    
      Repository_Workflow_Definition_Export_V.7.7.2IO result = (Repository_Workflow_Definition_Export_V.7.7.2IO) super.clone();

      if(fintObjInst != null) {
        result.fintObjInst = (Vector)fintObjInst.clone(); 

        for(int i = 0; i < fintObjInst.size(); ++i) {   
          Repository_Workflow_ProcessIC   elem  = (Repository_Workflow_ProcessIC)fintObjInst.elementAt(i); 

          result.fintObjInst.setElementAt(elem, i); 
        }/* for */ 
      }/* if */ 

      return result;
    }catch(CloneNotSupportedException cnse) {
       return null;
    }/* try - catch */
  }/* public Object clone(...) */


  public SiebelPropertySet toPropertySet() {
    SiebelPropertySet ps = new SiebelPropertySet();

    ps.setType(CLASS_PROPERTY);

    if(fIntObjectFormat != null)   
      ps.setProperty("IntObjectFormat", fIntObjectFormat); 

    if(fMessageType != null)   
      ps.setProperty("MessageType", fMessageType); 

    if(fMessageId != null)   
      ps.setProperty("MessageId", fMessageId); 

    if(fIntObjectName != null)   
      ps.setProperty("IntObjectName", fIntObjectName); 

    if(fOutputIntObjectName != null)   
      ps.setProperty("OutputIntObjectName", fOutputIntObjectName); 

    if(USING_LIST) { 
      /* 
       * if fintObjInst is null then 
       *      the Siebel Adapter will ignore it.
       * otherwise 
       *      it will attempt to sync it.
       */
      if(fintObjInst != null) {
        SiebelPropertySet childPs = new SiebelPropertySet(); 

        childPs.setType("ListOfRepository Workflow Definition Export V.7.7.2");

        for(int i = 0; i < fintObjInst.size(); ++i) { 
          Repository_Workflow_ProcessIC temp = (Repository_Workflow_ProcessIC)  fintObjInst.get(i);  

          childPs.addChild(temp.toPropertySet());
        }/* for */ 
        ps.addChild(childPs); 
      }/* if */
    }else{       /* not using list */ 
      if(fintObjInst != null) {
        for(int i = 0; i < fintObjInst.size(); ++i) {   
          Repository_Workflow_ProcessIC temp = (Repository_Workflow_ProcessIC)  fintObjInst.get(i); 

          ps.addChild(temp.toPropertySet()); 
        }/* for */ 
      }/* if */
    }/* if USING_LIST */ 

    return ps;
  }/* public SiebelPropertySet toPropertySet(...) */


  public void fromPropertySet(SiebelPropertySet ps) throws SiebelException {
    if((! PS_TYPE_REQUIRED) || (ps.getType().equals(CLASS_PROPERTY))) {
      fIntObjectFormat = ps.getProperty("IntObjectFormat");
      fMessageType = ps.getProperty("MessageType");
      fMessageId = ps.getProperty("MessageId");
      fIntObjectName = ps.getProperty("IntObjectName");
      fOutputIntObjectName = ps.getProperty("OutputIntObjectName");
      fintObjInst = null;

      for(int i = 0; i < ps.getChildCount(); ++i) {
        SiebelPropertySet  childPs = ps.getChild(i);

        if(USING_LIST) {  
          if(childPs.getType().equals("ListOfRepository Workflow Definition Export V.7.7.2")) { 
            for(int j = 0; j < childPs.getChildCount(); ++j){   
              Repository_Workflow_ProcessIC tmp = new Repository_Workflow_ProcessIC(childPs.getChild(j)); 

              addfintObjInst(tmp);
            }/* for */ 
          }/* if */  
        }else{   /* not using list */ 
          if(childPs.getType().equals("Repository Workflow Definition Export V.7.7.2")) { 
              Repository_Workflow_ProcessIC tmp = new Repository_Workflow_ProcessIC(childPs);    

              addfintObjInst(tmp);
          }/* if */ 
        }/* if */  

      }/* for */
    }else{
     SiebelException se = new SiebelException(1000, 100);  
        se.setDetailMessage("Input PropertySet is not of type [" + 
                            CLASS_PROPERTY + "]");   
        throw se; 
    }/* if */
  }/* public void fromPropertySet(...) */


  /* access methods for fIntObjectFormat */
  public     String getfIntObjectFormat() { 
    return fIntObjectFormat; 
  }/* public     String getfIntObjectFormat(...) */ 

  public     void setfIntObjectFormat(String val) { 
    fIntObjectFormat = val; 
  }/* public     void setfIntObjectFormat(...) */  


  /* access methods for fMessageType */
  public     String getfMessageType() { 
    return fMessageType; 
  }/* public     String getfMessageType(...) */ 

  public     void setfMessageType(String val) { 
    fMessageType = val; 
  }/* public     void setfMessageType(...) */  


  /* access methods for fMessageId */
  public     String getfMessageId() { 
    return fMessageId; 
  }/* public     String getfMessageId(...) */ 

  public     void setfMessageId(String val) { 
    fMessageId = val; 
  }/* public     void setfMessageId(...) */  


  /* access methods for fIntObjectName */
  public     String getfIntObjectName() { 
    return fIntObjectName; 
  }/* public     String getfIntObjectName(...) */ 

  public     void setfIntObjectName(String val) { 
    fIntObjectName = val; 
  }/* public     void setfIntObjectName(...) */  


  /* access methods for fOutputIntObjectName */
  public     String getfOutputIntObjectName() { 
    return fOutputIntObjectName; 
  }/* public     String getfOutputIntObjectName(...) */ 

  public     void setfOutputIntObjectName(String val) { 
    fOutputIntObjectName = val; 
  }/* public     void setfOutputIntObjectName(...) */  


  /* access methods for fintObjInst */
  public     Vector getfintObjInst() {     
    if(fintObjInst != null) {
      return (Vector)fintObjInst.clone();   
    }else{
      return null; 
    }/* if-else */
  }/* public     Vector getfintObjInst(...) */ 

  public     void addfintObjInst(Repository_Workflow_ProcessIC val) { 
    if(val != null) {
      if(fintObjInst == null) { 
        fintObjInst = new Vector(); 
      }/* if */ 

      fintObjInst.add(val); 
    }/* if */ 
  }/* public     void addfintObjInst(...) */ 

  public     void clearfintObjInst() { 
    if(fintObjInst != null) { 
      fintObjInst.removeAllElements(); 
      fintObjInst = null;
    }/* if */ 

    fintObjInst = new Vector();
  }/* public     void clearfintObjInst(...) */ 

  public     void removefintObjInst() { 
    if(fintObjInst != null) { 
      fintObjInst.removeAllElements(); 
      fintObjInst = null;
    }/* if */ 
  }/* public     void removefintObjInst(...) */ 




  /* member variables */
  protected String  fIntObjectFormat = null;
  protected String  fMessageType = "Integration Object";
  protected String  fMessageId = null;
  protected String  fIntObjectName = "Repository Workflow Definition Export V.7.7.2";
  protected String  fOutputIntObjectName = "Repository Workflow Definition Export V.7.7.2";
  protected Vector  fintObjInst = null;
}/* Repository_Workflow_Definition_Export_V.7.7.2IO */






