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
 *  
 * 
 * Generated from Siebel Java (JDB) Code Generator 
 * @author Siebel Systems, Inc. 
 * @see Siebel Code Generator 
 **/ 

public    class Repository_WF_StepIC implements  Serializable, Cloneable, SiebelHierarchy {
  /* class level properties */
  public    static final String  SIEBEL_REPOSITORY  = "Siebel Repository";
  public    static final String  SIEBEL_VERSION     = "";

  public    static final String  CLASS_PROPERTY     = "Repository WF Step";
  public    static final boolean USING_LIST         = true;
  public    static final boolean PS_TYPE_REQUIRED   = true;

  /* Field Level Properties */
  protected static final String  FALLOW_RETRY_FLAG_PROPERTY  =  "Allow Retry Flag";
  protected static final String  FBUSINESS_COMPONENT_PROPERTY  =  "Business Component";
  protected static final String  FBUSINESS_SERVICE_METHOD_PROPERTY  =  "Business Service Method";
  protected static final String  FBUSINESS_SERVICE_NAME_PROPERTY  =  "Business Service Name";
  protected static final String  FCOMMENTS_PROPERTY  =  "Comments";
  protected static final String  FDESCRIPTION_PROPERTY  =  "Description";
  protected static final String  FERROR_CODE_PROPERTY  =  "Error Code";
  protected static final String  FERROR_MESSAGE_PROPERTY  =  "Error Message";
  protected static final String  FEVALUATE_ALL_PROPERTY  =  "Evaluate All";
  protected static final String  FINACTIVE_PROPERTY  =  "Inactive";
  protected static final String  FLAYOUT_PROPERTY  =  "Layout";
  protected static final String  FMAXIMUM_ITERATIONS_PROPERTY  =  "Maximum Iterations";
  protected static final String  FNAME_PROPERTY  =  "Name";
  protected static final String  FOPERATIONTYPE_PROPERTY  =  "OperationType";
  protected static final String  FPROCESSING_MODE_PROPERTY  =  "Processing Mode";
  protected static final String  FSUBPROCESS_NAME_PROPERTY  =  "Subprocess Name";
  protected static final String  FTYPE_PROPERTY  =  "Type";
  protected static final String  FUSER_INTERACT_VIEW_PROPERTY  =  "User Interact View";
  protected static final String  FREPOSITORY_WF_STEP_BRANCHIC_PROPERTY  =  "Repository WF Step Branch";
  protected static final String  FREPOSITORY_WF_STEP_I_O_ARGUMENTIC_PROPERTY  =  "Repository WF Step I/O Argument";
  protected static final String  FREPOSITORY_WF_STEP_RECIPIENTIC_PROPERTY  =  "Repository WF Step Recipient";

  /* default constructor */ 
  public Repository_WF_StepIC()  { 
    super(); 
  }/* public Repository_WF_StepIC(...) */ 

 
  /* constructor from a Siebel Property Set */ 
  public Repository_WF_StepIC(SiebelPropertySet ps) throws SiebelException { 
    super(); 
    fromPropertySet(ps);  
  }/* public Repository_WF_StepIC(...) */     


  public int hashCode() {
    int HASH_PRIME = 51;
    int hash       =  0;

    if(fAllow_Retry_Flag != null) {
      hash = HASH_PRIME * hash + fAllow_Retry_Flag.hashCode(); 
    }/* if */

    if(fBusiness_Component != null) {
      hash = HASH_PRIME * hash + fBusiness_Component.hashCode(); 
    }/* if */

    if(fBusiness_Service_Method != null) {
      hash = HASH_PRIME * hash + fBusiness_Service_Method.hashCode(); 
    }/* if */

    if(fBusiness_Service_Name != null) {
      hash = HASH_PRIME * hash + fBusiness_Service_Name.hashCode(); 
    }/* if */

    if(fComments != null) {
      hash = HASH_PRIME * hash + fComments.hashCode(); 
    }/* if */

    if(fDescription != null) {
      hash = HASH_PRIME * hash + fDescription.hashCode(); 
    }/* if */

    if(fError_Code != null) {
      hash = HASH_PRIME * hash + fError_Code.hashCode(); 
    }/* if */

    if(fError_Message != null) {
      hash = HASH_PRIME * hash + fError_Message.hashCode(); 
    }/* if */

    if(fEvaluate_All != null) {
      hash = HASH_PRIME * hash + fEvaluate_All.hashCode(); 
    }/* if */

    if(fInactive != null) {
      hash = HASH_PRIME * hash + fInactive.hashCode(); 
    }/* if */

    if(fLayout != null) {
      hash = HASH_PRIME * hash + fLayout.hashCode(); 
    }/* if */

    if(fMaximum_Iterations != null) {
      hash = HASH_PRIME * hash + fMaximum_Iterations.hashCode(); 
    }/* if */

    if(fName != null) {
      hash = HASH_PRIME * hash + fName.hashCode(); 
    }/* if */

    if(fOperationType != null) {
      hash = HASH_PRIME * hash + fOperationType.hashCode(); 
    }/* if */

    if(fProcessing_Mode != null) {
      hash = HASH_PRIME * hash + fProcessing_Mode.hashCode(); 
    }/* if */

    if(fSubprocess_Name != null) {
      hash = HASH_PRIME * hash + fSubprocess_Name.hashCode(); 
    }/* if */

    if(fType != null) {
      hash = HASH_PRIME * hash + fType.hashCode(); 
    }/* if */

    if(fUser_Interact_View != null) {
      hash = HASH_PRIME * hash + fUser_Interact_View.hashCode(); 
    }/* if */

    if(fRepository_WF_Step_BranchIC != null) {
      for(int i = 0; i < fRepository_WF_Step_BranchIC.size(); ++i) { 
        Repository_WF_Step_BranchIC  tmp = (Repository_WF_Step_BranchIC)fRepository_WF_Step_BranchIC.get(i); 

        hash = HASH_PRIME * hash + tmp.hashCode(); 
      }/* for */ 
    }/* if */ 

    if(fRepository_WF_Step_I_O_ArgumentIC != null) {
      for(int i = 0; i < fRepository_WF_Step_I_O_ArgumentIC.size(); ++i) { 
        Repository_WF_Step_I_O_ArgumentIC  tmp = (Repository_WF_Step_I_O_ArgumentIC)fRepository_WF_Step_I_O_ArgumentIC.get(i); 

        hash = HASH_PRIME * hash + tmp.hashCode(); 
      }/* for */ 
    }/* if */ 

    if(fRepository_WF_Step_RecipientIC != null) {
      for(int i = 0; i < fRepository_WF_Step_RecipientIC.size(); ++i) { 
        Repository_WF_Step_RecipientIC  tmp = (Repository_WF_Step_RecipientIC)fRepository_WF_Step_RecipientIC.get(i); 

        hash = HASH_PRIME * hash + tmp.hashCode(); 
      }/* for */ 
    }/* if */ 

    return hash;
  }/* public int hashCode(...) */


  public boolean equals(Object object) {
    if(this == object) return true;
    if(object == null) return false;
    if(object.getClass() != getClass()) return false;
    Repository_WF_StepIC o = (Repository_WF_StepIC)object;

    if(fAllow_Retry_Flag == null) { 
       if(o.fAllow_Retry_Flag != null) return false; 
    }else if(! fAllow_Retry_Flag.equals(o.fAllow_Retry_Flag)) return false; 

    if(fBusiness_Component == null) { 
       if(o.fBusiness_Component != null) return false; 
    }else if(! fBusiness_Component.equals(o.fBusiness_Component)) return false; 

    if(fBusiness_Service_Method == null) { 
       if(o.fBusiness_Service_Method != null) return false; 
    }else if(! fBusiness_Service_Method.equals(o.fBusiness_Service_Method)) return false; 

    if(fBusiness_Service_Name == null) { 
       if(o.fBusiness_Service_Name != null) return false; 
    }else if(! fBusiness_Service_Name.equals(o.fBusiness_Service_Name)) return false; 

    if(fComments == null) { 
       if(o.fComments != null) return false; 
    }else if(! fComments.equals(o.fComments)) return false; 

    if(fDescription == null) { 
       if(o.fDescription != null) return false; 
    }else if(! fDescription.equals(o.fDescription)) return false; 

    if(fError_Code == null) { 
       if(o.fError_Code != null) return false; 
    }else if(! fError_Code.equals(o.fError_Code)) return false; 

    if(fError_Message == null) { 
       if(o.fError_Message != null) return false; 
    }else if(! fError_Message.equals(o.fError_Message)) return false; 

    if(fEvaluate_All == null) { 
       if(o.fEvaluate_All != null) return false; 
    }else if(! fEvaluate_All.equals(o.fEvaluate_All)) return false; 

    if(fInactive == null) { 
       if(o.fInactive != null) return false; 
    }else if(! fInactive.equals(o.fInactive)) return false; 

    if(fLayout == null) { 
       if(o.fLayout != null) return false; 
    }else if(! fLayout.equals(o.fLayout)) return false; 

    if(fMaximum_Iterations == null) { 
       if(o.fMaximum_Iterations != null) return false; 
    }else if(! fMaximum_Iterations.equals(o.fMaximum_Iterations)) return false; 

    if(fName == null) { 
       if(o.fName != null) return false; 
    }else if(! fName.equals(o.fName)) return false; 

    if(fOperationType == null) { 
       if(o.fOperationType != null) return false; 
    }else if(! fOperationType.equals(o.fOperationType)) return false; 

    if(fProcessing_Mode == null) { 
       if(o.fProcessing_Mode != null) return false; 
    }else if(! fProcessing_Mode.equals(o.fProcessing_Mode)) return false; 

    if(fSubprocess_Name == null) { 
       if(o.fSubprocess_Name != null) return false; 
    }else if(! fSubprocess_Name.equals(o.fSubprocess_Name)) return false; 

    if(fType == null) { 
       if(o.fType != null) return false; 
    }else if(! fType.equals(o.fType)) return false; 

    if(fUser_Interact_View == null) { 
       if(o.fUser_Interact_View != null) return false; 
    }else if(! fUser_Interact_View.equals(o.fUser_Interact_View)) return false; 

    if((fRepository_WF_Step_BranchIC != null) && (o.fRepository_WF_Step_BranchIC != null)) { 
      if(fRepository_WF_Step_BranchIC.size() != o.fRepository_WF_Step_BranchIC.size()) return false; 

      for(int i = 0; i < fRepository_WF_Step_BranchIC.size(); ++i) { 
         if(! fRepository_WF_Step_BranchIC.get(i).equals(o.fRepository_WF_Step_BranchIC.get(i)))   
           return false;  
      }/* for */  
    }else{
      if(fRepository_WF_Step_BranchIC != o.fRepository_WF_Step_BranchIC) return false;
    }/* if */

    if((fRepository_WF_Step_I_O_ArgumentIC != null) && (o.fRepository_WF_Step_I_O_ArgumentIC != null)) { 
      if(fRepository_WF_Step_I_O_ArgumentIC.size() != o.fRepository_WF_Step_I_O_ArgumentIC.size()) return false; 

      for(int i = 0; i < fRepository_WF_Step_I_O_ArgumentIC.size(); ++i) { 
         if(! fRepository_WF_Step_I_O_ArgumentIC.get(i).equals(o.fRepository_WF_Step_I_O_ArgumentIC.get(i)))   
           return false;  
      }/* for */  
    }else{
      if(fRepository_WF_Step_I_O_ArgumentIC != o.fRepository_WF_Step_I_O_ArgumentIC) return false;
    }/* if */

    if((fRepository_WF_Step_RecipientIC != null) && (o.fRepository_WF_Step_RecipientIC != null)) { 
      if(fRepository_WF_Step_RecipientIC.size() != o.fRepository_WF_Step_RecipientIC.size()) return false; 

      for(int i = 0; i < fRepository_WF_Step_RecipientIC.size(); ++i) { 
         if(! fRepository_WF_Step_RecipientIC.get(i).equals(o.fRepository_WF_Step_RecipientIC.get(i)))   
           return false;  
      }/* for */  
    }else{
      if(fRepository_WF_Step_RecipientIC != o.fRepository_WF_Step_RecipientIC) return false;
    }/* if */

    return true;
  }/* public int equals(...) */


  public Object clone() {
    try {    
      Repository_WF_StepIC result = (Repository_WF_StepIC) super.clone();

      if(fRepository_WF_Step_BranchIC != null) {
        result.fRepository_WF_Step_BranchIC = (Vector)fRepository_WF_Step_BranchIC.clone(); 

        for(int i = 0; i < fRepository_WF_Step_BranchIC.size(); ++i) {   
          Repository_WF_Step_BranchIC   elem  = (Repository_WF_Step_BranchIC)fRepository_WF_Step_BranchIC.elementAt(i); 

          result.fRepository_WF_Step_BranchIC.setElementAt(elem, i); 
        }/* for */ 
      }/* if */ 

      if(fRepository_WF_Step_I_O_ArgumentIC != null) {
        result.fRepository_WF_Step_I_O_ArgumentIC = (Vector)fRepository_WF_Step_I_O_ArgumentIC.clone(); 

        for(int i = 0; i < fRepository_WF_Step_I_O_ArgumentIC.size(); ++i) {   
          Repository_WF_Step_I_O_ArgumentIC   elem  = (Repository_WF_Step_I_O_ArgumentIC)fRepository_WF_Step_I_O_ArgumentIC.elementAt(i); 

          result.fRepository_WF_Step_I_O_ArgumentIC.setElementAt(elem, i); 
        }/* for */ 
      }/* if */ 

      if(fRepository_WF_Step_RecipientIC != null) {
        result.fRepository_WF_Step_RecipientIC = (Vector)fRepository_WF_Step_RecipientIC.clone(); 

        for(int i = 0; i < fRepository_WF_Step_RecipientIC.size(); ++i) {   
          Repository_WF_Step_RecipientIC   elem  = (Repository_WF_Step_RecipientIC)fRepository_WF_Step_RecipientIC.elementAt(i); 

          result.fRepository_WF_Step_RecipientIC.setElementAt(elem, i); 
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

    if(fAllow_Retry_Flag != null)   
      ps.setProperty("Allow Retry Flag", fAllow_Retry_Flag); 

    if(fBusiness_Component != null)   
      ps.setProperty("Business Component", fBusiness_Component); 

    if(fBusiness_Service_Method != null)   
      ps.setProperty("Business Service Method", fBusiness_Service_Method); 

    if(fBusiness_Service_Name != null)   
      ps.setProperty("Business Service Name", fBusiness_Service_Name); 

    if(fComments != null)   
      ps.setProperty("Comments", fComments); 

    if(fDescription != null)   
      ps.setProperty("Description", fDescription); 

    if(fError_Code != null)   
      ps.setProperty("Error Code", fError_Code); 

    if(fError_Message != null)   
      ps.setProperty("Error Message", fError_Message); 

    if(fEvaluate_All != null)   
      ps.setProperty("Evaluate All", fEvaluate_All); 

    if(fInactive != null)   
      ps.setProperty("Inactive", fInactive); 

    if(fLayout != null)   
      ps.setProperty("Layout", fLayout); 

    if(fMaximum_Iterations != null)   
      ps.setProperty("Maximum Iterations", fMaximum_Iterations); 

    if(fName != null)   
      ps.setProperty("Name", fName); 

    if(fOperationType != null)   
      ps.setProperty("OperationType", fOperationType); 

    if(fProcessing_Mode != null)   
      ps.setProperty("Processing Mode", fProcessing_Mode); 

    if(fSubprocess_Name != null)   
      ps.setProperty("Subprocess Name", fSubprocess_Name); 

    if(fType != null)   
      ps.setProperty("Type", fType); 

    if(fUser_Interact_View != null)   
      ps.setProperty("User Interact View", fUser_Interact_View); 

    if(USING_LIST) { 
      /* 
       * if fRepository_WF_Step_BranchIC is null then 
       *      the Siebel Adapter will ignore it.
       * otherwise 
       *      it will attempt to sync it.
       */
      if(fRepository_WF_Step_BranchIC != null) {
        SiebelPropertySet childPs = new SiebelPropertySet(); 

        childPs.setType("ListOfRepository WF Step Branch");

        for(int i = 0; i < fRepository_WF_Step_BranchIC.size(); ++i) { 
          Repository_WF_Step_BranchIC temp = (Repository_WF_Step_BranchIC)  fRepository_WF_Step_BranchIC.get(i);  

          childPs.addChild(temp.toPropertySet());
        }/* for */ 
        ps.addChild(childPs); 
      }/* if */
    }else{       /* not using list */ 
      if(fRepository_WF_Step_BranchIC != null) {
        for(int i = 0; i < fRepository_WF_Step_BranchIC.size(); ++i) {   
          Repository_WF_Step_BranchIC temp = (Repository_WF_Step_BranchIC)  fRepository_WF_Step_BranchIC.get(i); 

          ps.addChild(temp.toPropertySet()); 
        }/* for */ 
      }/* if */
    }/* if USING_LIST */ 

    if(USING_LIST) { 
      /* 
       * if fRepository_WF_Step_I_O_ArgumentIC is null then 
       *      the Siebel Adapter will ignore it.
       * otherwise 
       *      it will attempt to sync it.
       */
      if(fRepository_WF_Step_I_O_ArgumentIC != null) {
        SiebelPropertySet childPs = new SiebelPropertySet(); 

        childPs.setType("ListOfRepository WF Step I/O Argument");

        for(int i = 0; i < fRepository_WF_Step_I_O_ArgumentIC.size(); ++i) { 
          Repository_WF_Step_I_O_ArgumentIC temp = (Repository_WF_Step_I_O_ArgumentIC)  fRepository_WF_Step_I_O_ArgumentIC.get(i);  

          childPs.addChild(temp.toPropertySet());
        }/* for */ 
        ps.addChild(childPs); 
      }/* if */
    }else{       /* not using list */ 
      if(fRepository_WF_Step_I_O_ArgumentIC != null) {
        for(int i = 0; i < fRepository_WF_Step_I_O_ArgumentIC.size(); ++i) {   
          Repository_WF_Step_I_O_ArgumentIC temp = (Repository_WF_Step_I_O_ArgumentIC)  fRepository_WF_Step_I_O_ArgumentIC.get(i); 

          ps.addChild(temp.toPropertySet()); 
        }/* for */ 
      }/* if */
    }/* if USING_LIST */ 

    if(USING_LIST) { 
      /* 
       * if fRepository_WF_Step_RecipientIC is null then 
       *      the Siebel Adapter will ignore it.
       * otherwise 
       *      it will attempt to sync it.
       */
      if(fRepository_WF_Step_RecipientIC != null) {
        SiebelPropertySet childPs = new SiebelPropertySet(); 

        childPs.setType("ListOfRepository WF Step Recipient");

        for(int i = 0; i < fRepository_WF_Step_RecipientIC.size(); ++i) { 
          Repository_WF_Step_RecipientIC temp = (Repository_WF_Step_RecipientIC)  fRepository_WF_Step_RecipientIC.get(i);  

          childPs.addChild(temp.toPropertySet());
        }/* for */ 
        ps.addChild(childPs); 
      }/* if */
    }else{       /* not using list */ 
      if(fRepository_WF_Step_RecipientIC != null) {
        for(int i = 0; i < fRepository_WF_Step_RecipientIC.size(); ++i) {   
          Repository_WF_Step_RecipientIC temp = (Repository_WF_Step_RecipientIC)  fRepository_WF_Step_RecipientIC.get(i); 

          ps.addChild(temp.toPropertySet()); 
        }/* for */ 
      }/* if */
    }/* if USING_LIST */ 

    return ps;
  }/* public SiebelPropertySet toPropertySet(...) */


  public void fromPropertySet(SiebelPropertySet ps) throws SiebelException {
    if((! PS_TYPE_REQUIRED) || (ps.getType().equals(CLASS_PROPERTY))) {
      fAllow_Retry_Flag = ps.getProperty("Allow Retry Flag");
      fBusiness_Component = ps.getProperty("Business Component");
      fBusiness_Service_Method = ps.getProperty("Business Service Method");
      fBusiness_Service_Name = ps.getProperty("Business Service Name");
      fComments = ps.getProperty("Comments");
      fDescription = ps.getProperty("Description");
      fError_Code = ps.getProperty("Error Code");
      fError_Message = ps.getProperty("Error Message");
      fEvaluate_All = ps.getProperty("Evaluate All");
      fInactive = ps.getProperty("Inactive");
      fLayout = ps.getProperty("Layout");
      fMaximum_Iterations = ps.getProperty("Maximum Iterations");
      fName = ps.getProperty("Name");
      fOperationType = ps.getProperty("OperationType");
      fProcessing_Mode = ps.getProperty("Processing Mode");
      fSubprocess_Name = ps.getProperty("Subprocess Name");
      fType = ps.getProperty("Type");
      fUser_Interact_View = ps.getProperty("User Interact View");
      fRepository_WF_Step_BranchIC = null;
      fRepository_WF_Step_I_O_ArgumentIC = null;
      fRepository_WF_Step_RecipientIC = null;

      for(int i = 0; i < ps.getChildCount(); ++i) {
        SiebelPropertySet  childPs = ps.getChild(i);

        if(USING_LIST) {  
          if(childPs.getType().equals("ListOfRepository WF Step Branch")) { 
            for(int j = 0; j < childPs.getChildCount(); ++j){   
              Repository_WF_Step_BranchIC tmp = new Repository_WF_Step_BranchIC(childPs.getChild(j)); 

              addfRepository_WF_Step_BranchIC(tmp);
            }/* for */ 
          }/* if */  
        }else{   /* not using list */ 
          if(childPs.getType().equals("Repository WF Step Branch")) { 
              Repository_WF_Step_BranchIC tmp = new Repository_WF_Step_BranchIC(childPs);    

              addfRepository_WF_Step_BranchIC(tmp);
          }/* if */ 
        }/* if */  

        if(USING_LIST) {  
          if(childPs.getType().equals("ListOfRepository WF Step I/O Argument")) { 
            for(int j = 0; j < childPs.getChildCount(); ++j){   
              Repository_WF_Step_I_O_ArgumentIC tmp = new Repository_WF_Step_I_O_ArgumentIC(childPs.getChild(j)); 

              addfRepository_WF_Step_I_O_ArgumentIC(tmp);
            }/* for */ 
          }/* if */  
        }else{   /* not using list */ 
          if(childPs.getType().equals("Repository WF Step I/O Argument")) { 
              Repository_WF_Step_I_O_ArgumentIC tmp = new Repository_WF_Step_I_O_ArgumentIC(childPs);    

              addfRepository_WF_Step_I_O_ArgumentIC(tmp);
          }/* if */ 
        }/* if */  

        if(USING_LIST) {  
          if(childPs.getType().equals("ListOfRepository WF Step Recipient")) { 
            for(int j = 0; j < childPs.getChildCount(); ++j){   
              Repository_WF_Step_RecipientIC tmp = new Repository_WF_Step_RecipientIC(childPs.getChild(j)); 

              addfRepository_WF_Step_RecipientIC(tmp);
            }/* for */ 
          }/* if */  
        }else{   /* not using list */ 
          if(childPs.getType().equals("Repository WF Step Recipient")) { 
              Repository_WF_Step_RecipientIC tmp = new Repository_WF_Step_RecipientIC(childPs);    

              addfRepository_WF_Step_RecipientIC(tmp);
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


  /* access methods for fAllow_Retry_Flag */
  public     String getfAllow_Retry_Flag() { 
    return fAllow_Retry_Flag; 
  }/* public     String getfAllow_Retry_Flag(...) */ 

  public     void setfAllow_Retry_Flag(String val) { 
    fAllow_Retry_Flag = val; 
  }/* public     void setfAllow_Retry_Flag(...) */  


  /* access methods for fBusiness_Component */
  public     String getfBusiness_Component() { 
    return fBusiness_Component; 
  }/* public     String getfBusiness_Component(...) */ 

  public     void setfBusiness_Component(String val) { 
    fBusiness_Component = val; 
  }/* public     void setfBusiness_Component(...) */  


  /* access methods for fBusiness_Service_Method */
  public     String getfBusiness_Service_Method() { 
    return fBusiness_Service_Method; 
  }/* public     String getfBusiness_Service_Method(...) */ 

  public     void setfBusiness_Service_Method(String val) { 
    fBusiness_Service_Method = val; 
  }/* public     void setfBusiness_Service_Method(...) */  


  /* access methods for fBusiness_Service_Name */
  public     String getfBusiness_Service_Name() { 
    return fBusiness_Service_Name; 
  }/* public     String getfBusiness_Service_Name(...) */ 

  public     void setfBusiness_Service_Name(String val) { 
    fBusiness_Service_Name = val; 
  }/* public     void setfBusiness_Service_Name(...) */  


  /* access methods for fComments */
  public     String getfComments() { 
    return fComments; 
  }/* public     String getfComments(...) */ 

  public     void setfComments(String val) { 
    fComments = val; 
  }/* public     void setfComments(...) */  


  /* access methods for fDescription */
  public     String getfDescription() { 
    return fDescription; 
  }/* public     String getfDescription(...) */ 

  public     void setfDescription(String val) { 
    fDescription = val; 
  }/* public     void setfDescription(...) */  


  /* access methods for fError_Code */
  public     String getfError_Code() { 
    return fError_Code; 
  }/* public     String getfError_Code(...) */ 

  public     void setfError_Code(String val) { 
    fError_Code = val; 
  }/* public     void setfError_Code(...) */  


  /* access methods for fError_Message */
  public     String getfError_Message() { 
    return fError_Message; 
  }/* public     String getfError_Message(...) */ 

  public     void setfError_Message(String val) { 
    fError_Message = val; 
  }/* public     void setfError_Message(...) */  


  /* access methods for fEvaluate_All */
  public     String getfEvaluate_All() { 
    return fEvaluate_All; 
  }/* public     String getfEvaluate_All(...) */ 

  public     void setfEvaluate_All(String val) { 
    fEvaluate_All = val; 
  }/* public     void setfEvaluate_All(...) */  


  /* access methods for fInactive */
  public     String getfInactive() { 
    return fInactive; 
  }/* public     String getfInactive(...) */ 

  public     void setfInactive(String val) { 
    fInactive = val; 
  }/* public     void setfInactive(...) */  


  /* access methods for fLayout */
  public     String getfLayout() { 
    return fLayout; 
  }/* public     String getfLayout(...) */ 

  public     void setfLayout(String val) { 
    fLayout = val; 
  }/* public     void setfLayout(...) */  


  /* access methods for fMaximum_Iterations */
  public     String getfMaximum_Iterations() { 
    return fMaximum_Iterations; 
  }/* public     String getfMaximum_Iterations(...) */ 

  public     void setfMaximum_Iterations(String val) { 
    fMaximum_Iterations = val; 
  }/* public     void setfMaximum_Iterations(...) */  


  /* access methods for fName */
  public     String getfName() { 
    return fName; 
  }/* public     String getfName(...) */ 

  public     void setfName(String val) { 
    fName = val; 
  }/* public     void setfName(...) */  


  /* access methods for fOperationType */
  public     String getfOperationType() { 
    return fOperationType; 
  }/* public     String getfOperationType(...) */ 

  public     void setfOperationType(String val) { 
    fOperationType = val; 
  }/* public     void setfOperationType(...) */  


  /* access methods for fProcessing_Mode */
  public     String getfProcessing_Mode() { 
    return fProcessing_Mode; 
  }/* public     String getfProcessing_Mode(...) */ 

  public     void setfProcessing_Mode(String val) { 
    fProcessing_Mode = val; 
  }/* public     void setfProcessing_Mode(...) */  


  /* access methods for fSubprocess_Name */
  public     String getfSubprocess_Name() { 
    return fSubprocess_Name; 
  }/* public     String getfSubprocess_Name(...) */ 

  public     void setfSubprocess_Name(String val) { 
    fSubprocess_Name = val; 
  }/* public     void setfSubprocess_Name(...) */  


  /* access methods for fType */
  public     String getfType() { 
    return fType; 
  }/* public     String getfType(...) */ 

  public     void setfType(String val) { 
    fType = val; 
  }/* public     void setfType(...) */  


  /* access methods for fUser_Interact_View */
  public     String getfUser_Interact_View() { 
    return fUser_Interact_View; 
  }/* public     String getfUser_Interact_View(...) */ 

  public     void setfUser_Interact_View(String val) { 
    fUser_Interact_View = val; 
  }/* public     void setfUser_Interact_View(...) */  


  /* access methods for fRepository_WF_Step_BranchIC */
  public     Vector getfRepository_WF_Step_BranchIC() {     
    if(fRepository_WF_Step_BranchIC != null) {
      return (Vector)fRepository_WF_Step_BranchIC.clone();   
    }else{
      return null; 
    }/* if-else */
  }/* public     Vector getfRepository_WF_Step_BranchIC(...) */ 

  public     void addfRepository_WF_Step_BranchIC(Repository_WF_Step_BranchIC val) { 
    if(val != null) {
      if(fRepository_WF_Step_BranchIC == null) { 
        fRepository_WF_Step_BranchIC = new Vector(); 
      }/* if */ 

      fRepository_WF_Step_BranchIC.add(val); 
    }/* if */ 
  }/* public     void addfRepository_WF_Step_BranchIC(...) */ 

  public     void clearfRepository_WF_Step_BranchIC() { 
    if(fRepository_WF_Step_BranchIC != null) { 
      fRepository_WF_Step_BranchIC.removeAllElements(); 
      fRepository_WF_Step_BranchIC = null;
    }/* if */ 

    fRepository_WF_Step_BranchIC = new Vector();
  }/* public     void clearfRepository_WF_Step_BranchIC(...) */ 

  public     void removefRepository_WF_Step_BranchIC() { 
    if(fRepository_WF_Step_BranchIC != null) { 
      fRepository_WF_Step_BranchIC.removeAllElements(); 
      fRepository_WF_Step_BranchIC = null;
    }/* if */ 
  }/* public     void removefRepository_WF_Step_BranchIC(...) */ 


  /* access methods for fRepository_WF_Step_I_O_ArgumentIC */
  public     Vector getfRepository_WF_Step_I_O_ArgumentIC() {     
    if(fRepository_WF_Step_I_O_ArgumentIC != null) {
      return (Vector)fRepository_WF_Step_I_O_ArgumentIC.clone();   
    }else{
      return null; 
    }/* if-else */
  }/* public     Vector getfRepository_WF_Step_I_O_ArgumentIC(...) */ 

  public     void addfRepository_WF_Step_I_O_ArgumentIC(Repository_WF_Step_I_O_ArgumentIC val) { 
    if(val != null) {
      if(fRepository_WF_Step_I_O_ArgumentIC == null) { 
        fRepository_WF_Step_I_O_ArgumentIC = new Vector(); 
      }/* if */ 

      fRepository_WF_Step_I_O_ArgumentIC.add(val); 
    }/* if */ 
  }/* public     void addfRepository_WF_Step_I_O_ArgumentIC(...) */ 

  public     void clearfRepository_WF_Step_I_O_ArgumentIC() { 
    if(fRepository_WF_Step_I_O_ArgumentIC != null) { 
      fRepository_WF_Step_I_O_ArgumentIC.removeAllElements(); 
      fRepository_WF_Step_I_O_ArgumentIC = null;
    }/* if */ 

    fRepository_WF_Step_I_O_ArgumentIC = new Vector();
  }/* public     void clearfRepository_WF_Step_I_O_ArgumentIC(...) */ 

  public     void removefRepository_WF_Step_I_O_ArgumentIC() { 
    if(fRepository_WF_Step_I_O_ArgumentIC != null) { 
      fRepository_WF_Step_I_O_ArgumentIC.removeAllElements(); 
      fRepository_WF_Step_I_O_ArgumentIC = null;
    }/* if */ 
  }/* public     void removefRepository_WF_Step_I_O_ArgumentIC(...) */ 


  /* access methods for fRepository_WF_Step_RecipientIC */
  public     Vector getfRepository_WF_Step_RecipientIC() {     
    if(fRepository_WF_Step_RecipientIC != null) {
      return (Vector)fRepository_WF_Step_RecipientIC.clone();   
    }else{
      return null; 
    }/* if-else */
  }/* public     Vector getfRepository_WF_Step_RecipientIC(...) */ 

  public     void addfRepository_WF_Step_RecipientIC(Repository_WF_Step_RecipientIC val) { 
    if(val != null) {
      if(fRepository_WF_Step_RecipientIC == null) { 
        fRepository_WF_Step_RecipientIC = new Vector(); 
      }/* if */ 

      fRepository_WF_Step_RecipientIC.add(val); 
    }/* if */ 
  }/* public     void addfRepository_WF_Step_RecipientIC(...) */ 

  public     void clearfRepository_WF_Step_RecipientIC() { 
    if(fRepository_WF_Step_RecipientIC != null) { 
      fRepository_WF_Step_RecipientIC.removeAllElements(); 
      fRepository_WF_Step_RecipientIC = null;
    }/* if */ 

    fRepository_WF_Step_RecipientIC = new Vector();
  }/* public     void clearfRepository_WF_Step_RecipientIC(...) */ 

  public     void removefRepository_WF_Step_RecipientIC() { 
    if(fRepository_WF_Step_RecipientIC != null) { 
      fRepository_WF_Step_RecipientIC.removeAllElements(); 
      fRepository_WF_Step_RecipientIC = null;
    }/* if */ 
  }/* public     void removefRepository_WF_Step_RecipientIC(...) */ 




  /* member variables */
  protected String  fAllow_Retry_Flag = null;
  protected String  fBusiness_Component = null;
  protected String  fBusiness_Service_Method = null;
  protected String  fBusiness_Service_Name = null;
  protected String  fComments = null;
  protected String  fDescription = null;
  protected String  fError_Code = null;
  protected String  fError_Message = null;
  protected String  fEvaluate_All = null;
  protected String  fInactive = null;
  protected String  fLayout = null;
  protected String  fMaximum_Iterations = null;
  protected String  fName = null;
  protected String  fOperationType = null;
  protected String  fProcessing_Mode = null;
  protected String  fSubprocess_Name = null;
  protected String  fType = null;
  protected String  fUser_Interact_View = null;
  protected Vector  fRepository_WF_Step_BranchIC = null;
  protected Vector  fRepository_WF_Step_I_O_ArgumentIC = null;
  protected Vector  fRepository_WF_Step_RecipientIC = null;
}/* Repository_WF_StepIC */






