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

public    class Repository_WF_Branch_CriteriaIC implements  Serializable, Cloneable, SiebelHierarchy {
  /* class level properties */
  public    static final String  SIEBEL_REPOSITORY  = "Siebel Repository";
  public    static final String  SIEBEL_VERSION     = "";

  public    static final String  CLASS_PROPERTY     = "Repository WF Branch Criteria";
  public    static final boolean USING_LIST         = true;
  public    static final boolean PS_TYPE_REQUIRED   = true;

  /* Field Level Properties */
  protected static final String  FAPPLET_FIELD_NAME_PROPERTY  =  "Applet Field Name";
  protected static final String  FAPPLET_NAME_PROPERTY  =  "Applet Name";
  protected static final String  FBUSINESS_COMPONENT_PROPERTY  =  "Business Component";
  protected static final String  FBUSINESS_COMPONENT_FIELD_PROPERTY  =  "Business Component Field";
  protected static final String  FCOMMENTS_PROPERTY  =  "Comments";
  protected static final String  FCOMPARE_TO_PROPERTY  =  "Compare To";
  protected static final String  FINACTIVE_PROPERTY  =  "Inactive";
  protected static final String  FITEM_TYPE_NAME_PROPERTY  =  "Item Type Name";
  protected static final String  FNAME_PROPERTY  =  "Name";
  protected static final String  FOPERATIONTYPE_PROPERTY  =  "OperationType";
  protected static final String  FPROPERTY_NAME_PROPERTY  =  "Property Name";
  protected static final String  FSEQUENCE_PROPERTY  =  "Sequence";
  protected static final String  FREPOSITORY_WF_BRANCH_CRITERIA_VALUEIC_PROPERTY  =  "Repository WF Branch Criteria Value";

  /* default constructor */ 
  public Repository_WF_Branch_CriteriaIC()  { 
    super(); 
  }/* public Repository_WF_Branch_CriteriaIC(...) */ 

 
  /* constructor from a Siebel Property Set */ 
  public Repository_WF_Branch_CriteriaIC(SiebelPropertySet ps) throws SiebelException { 
    super(); 
    fromPropertySet(ps);  
  }/* public Repository_WF_Branch_CriteriaIC(...) */     


  public int hashCode() {
    int HASH_PRIME = 51;
    int hash       =  0;

    if(fApplet_Field_Name != null) {
      hash = HASH_PRIME * hash + fApplet_Field_Name.hashCode(); 
    }/* if */

    if(fApplet_Name != null) {
      hash = HASH_PRIME * hash + fApplet_Name.hashCode(); 
    }/* if */

    if(fBusiness_Component != null) {
      hash = HASH_PRIME * hash + fBusiness_Component.hashCode(); 
    }/* if */

    if(fBusiness_Component_Field != null) {
      hash = HASH_PRIME * hash + fBusiness_Component_Field.hashCode(); 
    }/* if */

    if(fComments != null) {
      hash = HASH_PRIME * hash + fComments.hashCode(); 
    }/* if */

    if(fCompare_To != null) {
      hash = HASH_PRIME * hash + fCompare_To.hashCode(); 
    }/* if */

    if(fInactive != null) {
      hash = HASH_PRIME * hash + fInactive.hashCode(); 
    }/* if */

    if(fItem_Type_Name != null) {
      hash = HASH_PRIME * hash + fItem_Type_Name.hashCode(); 
    }/* if */

    if(fName != null) {
      hash = HASH_PRIME * hash + fName.hashCode(); 
    }/* if */

    if(fOperationType != null) {
      hash = HASH_PRIME * hash + fOperationType.hashCode(); 
    }/* if */

    if(fProperty_Name != null) {
      hash = HASH_PRIME * hash + fProperty_Name.hashCode(); 
    }/* if */

    if(fSequence != null) {
      hash = HASH_PRIME * hash + fSequence.hashCode(); 
    }/* if */

    if(fRepository_WF_Branch_Criteria_ValueIC != null) {
      for(int i = 0; i < fRepository_WF_Branch_Criteria_ValueIC.size(); ++i) { 
        Repository_WF_Branch_Criteria_ValueIC  tmp = (Repository_WF_Branch_Criteria_ValueIC)fRepository_WF_Branch_Criteria_ValueIC.get(i); 

        hash = HASH_PRIME * hash + tmp.hashCode(); 
      }/* for */ 
    }/* if */ 

    return hash;
  }/* public int hashCode(...) */


  public boolean equals(Object object) {
    if(this == object) return true;
    if(object == null) return false;
    if(object.getClass() != getClass()) return false;
    Repository_WF_Branch_CriteriaIC o = (Repository_WF_Branch_CriteriaIC)object;

    if(fApplet_Field_Name == null) { 
       if(o.fApplet_Field_Name != null) return false; 
    }else if(! fApplet_Field_Name.equals(o.fApplet_Field_Name)) return false; 

    if(fApplet_Name == null) { 
       if(o.fApplet_Name != null) return false; 
    }else if(! fApplet_Name.equals(o.fApplet_Name)) return false; 

    if(fBusiness_Component == null) { 
       if(o.fBusiness_Component != null) return false; 
    }else if(! fBusiness_Component.equals(o.fBusiness_Component)) return false; 

    if(fBusiness_Component_Field == null) { 
       if(o.fBusiness_Component_Field != null) return false; 
    }else if(! fBusiness_Component_Field.equals(o.fBusiness_Component_Field)) return false; 

    if(fComments == null) { 
       if(o.fComments != null) return false; 
    }else if(! fComments.equals(o.fComments)) return false; 

    if(fCompare_To == null) { 
       if(o.fCompare_To != null) return false; 
    }else if(! fCompare_To.equals(o.fCompare_To)) return false; 

    if(fInactive == null) { 
       if(o.fInactive != null) return false; 
    }else if(! fInactive.equals(o.fInactive)) return false; 

    if(fItem_Type_Name == null) { 
       if(o.fItem_Type_Name != null) return false; 
    }else if(! fItem_Type_Name.equals(o.fItem_Type_Name)) return false; 

    if(fName == null) { 
       if(o.fName != null) return false; 
    }else if(! fName.equals(o.fName)) return false; 

    if(fOperationType == null) { 
       if(o.fOperationType != null) return false; 
    }else if(! fOperationType.equals(o.fOperationType)) return false; 

    if(fProperty_Name == null) { 
       if(o.fProperty_Name != null) return false; 
    }else if(! fProperty_Name.equals(o.fProperty_Name)) return false; 

    if(fSequence == null) { 
       if(o.fSequence != null) return false; 
    }else if(! fSequence.equals(o.fSequence)) return false; 

    if((fRepository_WF_Branch_Criteria_ValueIC != null) && (o.fRepository_WF_Branch_Criteria_ValueIC != null)) { 
      if(fRepository_WF_Branch_Criteria_ValueIC.size() != o.fRepository_WF_Branch_Criteria_ValueIC.size()) return false; 

      for(int i = 0; i < fRepository_WF_Branch_Criteria_ValueIC.size(); ++i) { 
         if(! fRepository_WF_Branch_Criteria_ValueIC.get(i).equals(o.fRepository_WF_Branch_Criteria_ValueIC.get(i)))   
           return false;  
      }/* for */  
    }else{
      if(fRepository_WF_Branch_Criteria_ValueIC != o.fRepository_WF_Branch_Criteria_ValueIC) return false;
    }/* if */

    return true;
  }/* public int equals(...) */


  public Object clone() {
    try {    
      Repository_WF_Branch_CriteriaIC result = (Repository_WF_Branch_CriteriaIC) super.clone();

      if(fRepository_WF_Branch_Criteria_ValueIC != null) {
        result.fRepository_WF_Branch_Criteria_ValueIC = (Vector)fRepository_WF_Branch_Criteria_ValueIC.clone(); 

        for(int i = 0; i < fRepository_WF_Branch_Criteria_ValueIC.size(); ++i) {   
          Repository_WF_Branch_Criteria_ValueIC   elem  = (Repository_WF_Branch_Criteria_ValueIC)fRepository_WF_Branch_Criteria_ValueIC.elementAt(i); 

          result.fRepository_WF_Branch_Criteria_ValueIC.setElementAt(elem, i); 
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

    if(fApplet_Field_Name != null)   
      ps.setProperty("Applet Field Name", fApplet_Field_Name); 

    if(fApplet_Name != null)   
      ps.setProperty("Applet Name", fApplet_Name); 

    if(fBusiness_Component != null)   
      ps.setProperty("Business Component", fBusiness_Component); 

    if(fBusiness_Component_Field != null)   
      ps.setProperty("Business Component Field", fBusiness_Component_Field); 

    if(fComments != null)   
      ps.setProperty("Comments", fComments); 

    if(fCompare_To != null)   
      ps.setProperty("Compare To", fCompare_To); 

    if(fInactive != null)   
      ps.setProperty("Inactive", fInactive); 

    if(fItem_Type_Name != null)   
      ps.setProperty("Item Type Name", fItem_Type_Name); 

    if(fName != null)   
      ps.setProperty("Name", fName); 

    if(fOperationType != null)   
      ps.setProperty("OperationType", fOperationType); 

    if(fProperty_Name != null)   
      ps.setProperty("Property Name", fProperty_Name); 

    if(fSequence != null)   
      ps.setProperty("Sequence", fSequence); 

    if(USING_LIST) { 
      /* 
       * if fRepository_WF_Branch_Criteria_ValueIC is null then 
       *      the Siebel Adapter will ignore it.
       * otherwise 
       *      it will attempt to sync it.
       */
      if(fRepository_WF_Branch_Criteria_ValueIC != null) {
        SiebelPropertySet childPs = new SiebelPropertySet(); 

        childPs.setType("ListOfRepository WF Branch Criteria Value");

        for(int i = 0; i < fRepository_WF_Branch_Criteria_ValueIC.size(); ++i) { 
          Repository_WF_Branch_Criteria_ValueIC temp = (Repository_WF_Branch_Criteria_ValueIC)  fRepository_WF_Branch_Criteria_ValueIC.get(i);  

          childPs.addChild(temp.toPropertySet());
        }/* for */ 
        ps.addChild(childPs); 
      }/* if */
    }else{       /* not using list */ 
      if(fRepository_WF_Branch_Criteria_ValueIC != null) {
        for(int i = 0; i < fRepository_WF_Branch_Criteria_ValueIC.size(); ++i) {   
          Repository_WF_Branch_Criteria_ValueIC temp = (Repository_WF_Branch_Criteria_ValueIC)  fRepository_WF_Branch_Criteria_ValueIC.get(i); 

          ps.addChild(temp.toPropertySet()); 
        }/* for */ 
      }/* if */
    }/* if USING_LIST */ 

    return ps;
  }/* public SiebelPropertySet toPropertySet(...) */


  public void fromPropertySet(SiebelPropertySet ps) throws SiebelException {
    if((! PS_TYPE_REQUIRED) || (ps.getType().equals(CLASS_PROPERTY))) {
      fApplet_Field_Name = ps.getProperty("Applet Field Name");
      fApplet_Name = ps.getProperty("Applet Name");
      fBusiness_Component = ps.getProperty("Business Component");
      fBusiness_Component_Field = ps.getProperty("Business Component Field");
      fComments = ps.getProperty("Comments");
      fCompare_To = ps.getProperty("Compare To");
      fInactive = ps.getProperty("Inactive");
      fItem_Type_Name = ps.getProperty("Item Type Name");
      fName = ps.getProperty("Name");
      fOperationType = ps.getProperty("OperationType");
      fProperty_Name = ps.getProperty("Property Name");
      fSequence = ps.getProperty("Sequence");
      fRepository_WF_Branch_Criteria_ValueIC = null;

      for(int i = 0; i < ps.getChildCount(); ++i) {
        SiebelPropertySet  childPs = ps.getChild(i);

        if(USING_LIST) {  
          if(childPs.getType().equals("ListOfRepository WF Branch Criteria Value")) { 
            for(int j = 0; j < childPs.getChildCount(); ++j){   
              Repository_WF_Branch_Criteria_ValueIC tmp = new Repository_WF_Branch_Criteria_ValueIC(childPs.getChild(j)); 

              addfRepository_WF_Branch_Criteria_ValueIC(tmp);
            }/* for */ 
          }/* if */  
        }else{   /* not using list */ 
          if(childPs.getType().equals("Repository WF Branch Criteria Value")) { 
              Repository_WF_Branch_Criteria_ValueIC tmp = new Repository_WF_Branch_Criteria_ValueIC(childPs);    

              addfRepository_WF_Branch_Criteria_ValueIC(tmp);
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


  /* access methods for fApplet_Field_Name */
  public     String getfApplet_Field_Name() { 
    return fApplet_Field_Name; 
  }/* public     String getfApplet_Field_Name(...) */ 

  public     void setfApplet_Field_Name(String val) { 
    fApplet_Field_Name = val; 
  }/* public     void setfApplet_Field_Name(...) */  


  /* access methods for fApplet_Name */
  public     String getfApplet_Name() { 
    return fApplet_Name; 
  }/* public     String getfApplet_Name(...) */ 

  public     void setfApplet_Name(String val) { 
    fApplet_Name = val; 
  }/* public     void setfApplet_Name(...) */  


  /* access methods for fBusiness_Component */
  public     String getfBusiness_Component() { 
    return fBusiness_Component; 
  }/* public     String getfBusiness_Component(...) */ 

  public     void setfBusiness_Component(String val) { 
    fBusiness_Component = val; 
  }/* public     void setfBusiness_Component(...) */  


  /* access methods for fBusiness_Component_Field */
  public     String getfBusiness_Component_Field() { 
    return fBusiness_Component_Field; 
  }/* public     String getfBusiness_Component_Field(...) */ 

  public     void setfBusiness_Component_Field(String val) { 
    fBusiness_Component_Field = val; 
  }/* public     void setfBusiness_Component_Field(...) */  


  /* access methods for fComments */
  public     String getfComments() { 
    return fComments; 
  }/* public     String getfComments(...) */ 

  public     void setfComments(String val) { 
    fComments = val; 
  }/* public     void setfComments(...) */  


  /* access methods for fCompare_To */
  public     String getfCompare_To() { 
    return fCompare_To; 
  }/* public     String getfCompare_To(...) */ 

  public     void setfCompare_To(String val) { 
    fCompare_To = val; 
  }/* public     void setfCompare_To(...) */  


  /* access methods for fInactive */
  public     String getfInactive() { 
    return fInactive; 
  }/* public     String getfInactive(...) */ 

  public     void setfInactive(String val) { 
    fInactive = val; 
  }/* public     void setfInactive(...) */  


  /* access methods for fItem_Type_Name */
  public     String getfItem_Type_Name() { 
    return fItem_Type_Name; 
  }/* public     String getfItem_Type_Name(...) */ 

  public     void setfItem_Type_Name(String val) { 
    fItem_Type_Name = val; 
  }/* public     void setfItem_Type_Name(...) */  


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


  /* access methods for fProperty_Name */
  public     String getfProperty_Name() { 
    return fProperty_Name; 
  }/* public     String getfProperty_Name(...) */ 

  public     void setfProperty_Name(String val) { 
    fProperty_Name = val; 
  }/* public     void setfProperty_Name(...) */  


  /* access methods for fSequence */
  public     String getfSequence() { 
    return fSequence; 
  }/* public     String getfSequence(...) */ 

  public     void setfSequence(String val) { 
    fSequence = val; 
  }/* public     void setfSequence(...) */  


  /* access methods for fRepository_WF_Branch_Criteria_ValueIC */
  public     Vector getfRepository_WF_Branch_Criteria_ValueIC() {     
    if(fRepository_WF_Branch_Criteria_ValueIC != null) {
      return (Vector)fRepository_WF_Branch_Criteria_ValueIC.clone();   
    }else{
      return null; 
    }/* if-else */
  }/* public     Vector getfRepository_WF_Branch_Criteria_ValueIC(...) */ 

  public     void addfRepository_WF_Branch_Criteria_ValueIC(Repository_WF_Branch_Criteria_ValueIC val) { 
    if(val != null) {
      if(fRepository_WF_Branch_Criteria_ValueIC == null) { 
        fRepository_WF_Branch_Criteria_ValueIC = new Vector(); 
      }/* if */ 

      fRepository_WF_Branch_Criteria_ValueIC.add(val); 
    }/* if */ 
  }/* public     void addfRepository_WF_Branch_Criteria_ValueIC(...) */ 

  public     void clearfRepository_WF_Branch_Criteria_ValueIC() { 
    if(fRepository_WF_Branch_Criteria_ValueIC != null) { 
      fRepository_WF_Branch_Criteria_ValueIC.removeAllElements(); 
      fRepository_WF_Branch_Criteria_ValueIC = null;
    }/* if */ 

    fRepository_WF_Branch_Criteria_ValueIC = new Vector();
  }/* public     void clearfRepository_WF_Branch_Criteria_ValueIC(...) */ 

  public     void removefRepository_WF_Branch_Criteria_ValueIC() { 
    if(fRepository_WF_Branch_Criteria_ValueIC != null) { 
      fRepository_WF_Branch_Criteria_ValueIC.removeAllElements(); 
      fRepository_WF_Branch_Criteria_ValueIC = null;
    }/* if */ 
  }/* public     void removefRepository_WF_Branch_Criteria_ValueIC(...) */ 




  /* member variables */
  protected String  fApplet_Field_Name = null;
  protected String  fApplet_Name = null;
  protected String  fBusiness_Component = null;
  protected String  fBusiness_Component_Field = null;
  protected String  fComments = null;
  protected String  fCompare_To = null;
  protected String  fInactive = null;
  protected String  fItem_Type_Name = null;
  protected String  fName = null;
  protected String  fOperationType = null;
  protected String  fProperty_Name = null;
  protected String  fSequence = null;
  protected Vector  fRepository_WF_Branch_Criteria_ValueIC = null;
}/* Repository_WF_Branch_CriteriaIC */






