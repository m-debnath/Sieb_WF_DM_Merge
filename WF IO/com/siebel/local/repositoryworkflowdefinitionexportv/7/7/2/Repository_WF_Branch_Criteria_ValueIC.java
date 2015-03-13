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

public    class Repository_WF_Branch_Criteria_ValueIC implements  Serializable, Cloneable, SiebelHierarchy {
  /* class level properties */
  public    static final String  SIEBEL_REPOSITORY  = "Siebel Repository";
  public    static final String  SIEBEL_VERSION     = "";

  public    static final String  CLASS_PROPERTY     = "Repository WF Branch Criteria Value";
  public    static final boolean USING_LIST         = true;
  public    static final boolean PS_TYPE_REQUIRED   = true;

  /* Field Level Properties */
  protected static final String  FCOMMENTS_PROPERTY  =  "Comments";
  protected static final String  FHI_CHAR1_PROPERTY  =  "HI_CHAR1";
  protected static final String  FHI_CHAR2_PROPERTY  =  "HI_CHAR2";
  protected static final String  FHI_CHAR3_PROPERTY  =  "HI_CHAR3";
  protected static final String  FHI_CHAR4_PROPERTY  =  "HI_CHAR4";
  protected static final String  FHI_DATE1_PROPERTY  =  "HI_DATE1";
  protected static final String  FHI_DATE2_PROPERTY  =  "HI_DATE2";
  protected static final String  FHI_DATE3_PROPERTY  =  "HI_DATE3";
  protected static final String  FHI_DATE4_PROPERTY  =  "HI_DATE4";
  protected static final String  FHI_NUM1_PROPERTY  =  "HI_NUM1";
  protected static final String  FHI_NUM2_PROPERTY  =  "HI_NUM2";
  protected static final String  FHI_NUM3_PROPERTY  =  "HI_NUM3";
  protected static final String  FHI_NUM4_PROPERTY  =  "HI_NUM4";
  protected static final String  FINACTIVE_PROPERTY  =  "Inactive";
  protected static final String  FLO_CHAR1_PROPERTY  =  "LO_CHAR1";
  protected static final String  FLO_CHAR2_PROPERTY  =  "LO_CHAR2";
  protected static final String  FLO_CHAR3_PROPERTY  =  "LO_CHAR3";
  protected static final String  FLO_CHAR4_PROPERTY  =  "LO_CHAR4";
  protected static final String  FLO_CHAR5_PROPERTY  =  "LO_CHAR5";
  protected static final String  FLO_DATE1_PROPERTY  =  "LO_DATE1";
  protected static final String  FLO_DATE2_PROPERTY  =  "LO_DATE2";
  protected static final String  FLO_DATE3_PROPERTY  =  "LO_DATE3";
  protected static final String  FLO_DATE4_PROPERTY  =  "LO_DATE4";
  protected static final String  FLO_NUM1_PROPERTY  =  "LO_NUM1";
  protected static final String  FLO_NUM2_PROPERTY  =  "LO_NUM2";
  protected static final String  FLO_NUM3_PROPERTY  =  "LO_NUM3";
  protected static final String  FLO_NUM4_PROPERTY  =  "LO_NUM4";
  protected static final String  FNAME_PROPERTY  =  "Name";
  protected static final String  FSEQUENCE_PROPERTY  =  "Sequence";

  /* default constructor */ 
  public Repository_WF_Branch_Criteria_ValueIC()  { 
    super(); 
  }/* public Repository_WF_Branch_Criteria_ValueIC(...) */ 

 
  /* constructor from a Siebel Property Set */ 
  public Repository_WF_Branch_Criteria_ValueIC(SiebelPropertySet ps) throws SiebelException { 
    super(); 
    fromPropertySet(ps);  
  }/* public Repository_WF_Branch_Criteria_ValueIC(...) */     


  public int hashCode() {
    int HASH_PRIME = 51;
    int hash       =  0;

    if(fComments != null) {
      hash = HASH_PRIME * hash + fComments.hashCode(); 
    }/* if */

    if(fHI_CHAR1 != null) {
      hash = HASH_PRIME * hash + fHI_CHAR1.hashCode(); 
    }/* if */

    if(fHI_CHAR2 != null) {
      hash = HASH_PRIME * hash + fHI_CHAR2.hashCode(); 
    }/* if */

    if(fHI_CHAR3 != null) {
      hash = HASH_PRIME * hash + fHI_CHAR3.hashCode(); 
    }/* if */

    if(fHI_CHAR4 != null) {
      hash = HASH_PRIME * hash + fHI_CHAR4.hashCode(); 
    }/* if */

    if(fHI_DATE1 != null) {
      hash = HASH_PRIME * hash + fHI_DATE1.hashCode(); 
    }/* if */

    if(fHI_DATE2 != null) {
      hash = HASH_PRIME * hash + fHI_DATE2.hashCode(); 
    }/* if */

    if(fHI_DATE3 != null) {
      hash = HASH_PRIME * hash + fHI_DATE3.hashCode(); 
    }/* if */

    if(fHI_DATE4 != null) {
      hash = HASH_PRIME * hash + fHI_DATE4.hashCode(); 
    }/* if */

    if(fHI_NUM1 != null) {
      hash = HASH_PRIME * hash + fHI_NUM1.hashCode(); 
    }/* if */

    if(fHI_NUM2 != null) {
      hash = HASH_PRIME * hash + fHI_NUM2.hashCode(); 
    }/* if */

    if(fHI_NUM3 != null) {
      hash = HASH_PRIME * hash + fHI_NUM3.hashCode(); 
    }/* if */

    if(fHI_NUM4 != null) {
      hash = HASH_PRIME * hash + fHI_NUM4.hashCode(); 
    }/* if */

    if(fInactive != null) {
      hash = HASH_PRIME * hash + fInactive.hashCode(); 
    }/* if */

    if(fLO_CHAR1 != null) {
      hash = HASH_PRIME * hash + fLO_CHAR1.hashCode(); 
    }/* if */

    if(fLO_CHAR2 != null) {
      hash = HASH_PRIME * hash + fLO_CHAR2.hashCode(); 
    }/* if */

    if(fLO_CHAR3 != null) {
      hash = HASH_PRIME * hash + fLO_CHAR3.hashCode(); 
    }/* if */

    if(fLO_CHAR4 != null) {
      hash = HASH_PRIME * hash + fLO_CHAR4.hashCode(); 
    }/* if */

    if(fLO_CHAR5 != null) {
      hash = HASH_PRIME * hash + fLO_CHAR5.hashCode(); 
    }/* if */

    if(fLO_DATE1 != null) {
      hash = HASH_PRIME * hash + fLO_DATE1.hashCode(); 
    }/* if */

    if(fLO_DATE2 != null) {
      hash = HASH_PRIME * hash + fLO_DATE2.hashCode(); 
    }/* if */

    if(fLO_DATE3 != null) {
      hash = HASH_PRIME * hash + fLO_DATE3.hashCode(); 
    }/* if */

    if(fLO_DATE4 != null) {
      hash = HASH_PRIME * hash + fLO_DATE4.hashCode(); 
    }/* if */

    if(fLO_NUM1 != null) {
      hash = HASH_PRIME * hash + fLO_NUM1.hashCode(); 
    }/* if */

    if(fLO_NUM2 != null) {
      hash = HASH_PRIME * hash + fLO_NUM2.hashCode(); 
    }/* if */

    if(fLO_NUM3 != null) {
      hash = HASH_PRIME * hash + fLO_NUM3.hashCode(); 
    }/* if */

    if(fLO_NUM4 != null) {
      hash = HASH_PRIME * hash + fLO_NUM4.hashCode(); 
    }/* if */

    if(fName != null) {
      hash = HASH_PRIME * hash + fName.hashCode(); 
    }/* if */

    if(fSequence != null) {
      hash = HASH_PRIME * hash + fSequence.hashCode(); 
    }/* if */

    return hash;
  }/* public int hashCode(...) */


  public boolean equals(Object object) {
    if(this == object) return true;
    if(object == null) return false;
    if(object.getClass() != getClass()) return false;
    Repository_WF_Branch_Criteria_ValueIC o = (Repository_WF_Branch_Criteria_ValueIC)object;

    if(fComments == null) { 
       if(o.fComments != null) return false; 
    }else if(! fComments.equals(o.fComments)) return false; 

    if(fHI_CHAR1 == null) { 
       if(o.fHI_CHAR1 != null) return false; 
    }else if(! fHI_CHAR1.equals(o.fHI_CHAR1)) return false; 

    if(fHI_CHAR2 == null) { 
       if(o.fHI_CHAR2 != null) return false; 
    }else if(! fHI_CHAR2.equals(o.fHI_CHAR2)) return false; 

    if(fHI_CHAR3 == null) { 
       if(o.fHI_CHAR3 != null) return false; 
    }else if(! fHI_CHAR3.equals(o.fHI_CHAR3)) return false; 

    if(fHI_CHAR4 == null) { 
       if(o.fHI_CHAR4 != null) return false; 
    }else if(! fHI_CHAR4.equals(o.fHI_CHAR4)) return false; 

    if(fHI_DATE1 == null) { 
       if(o.fHI_DATE1 != null) return false; 
    }else if(! fHI_DATE1.equals(o.fHI_DATE1)) return false; 

    if(fHI_DATE2 == null) { 
       if(o.fHI_DATE2 != null) return false; 
    }else if(! fHI_DATE2.equals(o.fHI_DATE2)) return false; 

    if(fHI_DATE3 == null) { 
       if(o.fHI_DATE3 != null) return false; 
    }else if(! fHI_DATE3.equals(o.fHI_DATE3)) return false; 

    if(fHI_DATE4 == null) { 
       if(o.fHI_DATE4 != null) return false; 
    }else if(! fHI_DATE4.equals(o.fHI_DATE4)) return false; 

    if(fHI_NUM1 == null) { 
       if(o.fHI_NUM1 != null) return false; 
    }else if(! fHI_NUM1.equals(o.fHI_NUM1)) return false; 

    if(fHI_NUM2 == null) { 
       if(o.fHI_NUM2 != null) return false; 
    }else if(! fHI_NUM2.equals(o.fHI_NUM2)) return false; 

    if(fHI_NUM3 == null) { 
       if(o.fHI_NUM3 != null) return false; 
    }else if(! fHI_NUM3.equals(o.fHI_NUM3)) return false; 

    if(fHI_NUM4 == null) { 
       if(o.fHI_NUM4 != null) return false; 
    }else if(! fHI_NUM4.equals(o.fHI_NUM4)) return false; 

    if(fInactive == null) { 
       if(o.fInactive != null) return false; 
    }else if(! fInactive.equals(o.fInactive)) return false; 

    if(fLO_CHAR1 == null) { 
       if(o.fLO_CHAR1 != null) return false; 
    }else if(! fLO_CHAR1.equals(o.fLO_CHAR1)) return false; 

    if(fLO_CHAR2 == null) { 
       if(o.fLO_CHAR2 != null) return false; 
    }else if(! fLO_CHAR2.equals(o.fLO_CHAR2)) return false; 

    if(fLO_CHAR3 == null) { 
       if(o.fLO_CHAR3 != null) return false; 
    }else if(! fLO_CHAR3.equals(o.fLO_CHAR3)) return false; 

    if(fLO_CHAR4 == null) { 
       if(o.fLO_CHAR4 != null) return false; 
    }else if(! fLO_CHAR4.equals(o.fLO_CHAR4)) return false; 

    if(fLO_CHAR5 == null) { 
       if(o.fLO_CHAR5 != null) return false; 
    }else if(! fLO_CHAR5.equals(o.fLO_CHAR5)) return false; 

    if(fLO_DATE1 == null) { 
       if(o.fLO_DATE1 != null) return false; 
    }else if(! fLO_DATE1.equals(o.fLO_DATE1)) return false; 

    if(fLO_DATE2 == null) { 
       if(o.fLO_DATE2 != null) return false; 
    }else if(! fLO_DATE2.equals(o.fLO_DATE2)) return false; 

    if(fLO_DATE3 == null) { 
       if(o.fLO_DATE3 != null) return false; 
    }else if(! fLO_DATE3.equals(o.fLO_DATE3)) return false; 

    if(fLO_DATE4 == null) { 
       if(o.fLO_DATE4 != null) return false; 
    }else if(! fLO_DATE4.equals(o.fLO_DATE4)) return false; 

    if(fLO_NUM1 == null) { 
       if(o.fLO_NUM1 != null) return false; 
    }else if(! fLO_NUM1.equals(o.fLO_NUM1)) return false; 

    if(fLO_NUM2 == null) { 
       if(o.fLO_NUM2 != null) return false; 
    }else if(! fLO_NUM2.equals(o.fLO_NUM2)) return false; 

    if(fLO_NUM3 == null) { 
       if(o.fLO_NUM3 != null) return false; 
    }else if(! fLO_NUM3.equals(o.fLO_NUM3)) return false; 

    if(fLO_NUM4 == null) { 
       if(o.fLO_NUM4 != null) return false; 
    }else if(! fLO_NUM4.equals(o.fLO_NUM4)) return false; 

    if(fName == null) { 
       if(o.fName != null) return false; 
    }else if(! fName.equals(o.fName)) return false; 

    if(fSequence == null) { 
       if(o.fSequence != null) return false; 
    }else if(! fSequence.equals(o.fSequence)) return false; 

    return true;
  }/* public int equals(...) */


  public Object clone() {
    try {    
      Repository_WF_Branch_Criteria_ValueIC result = (Repository_WF_Branch_Criteria_ValueIC) super.clone();

      return result;
    }catch(CloneNotSupportedException cnse) {
       return null;
    }/* try - catch */
  }/* public Object clone(...) */


  public SiebelPropertySet toPropertySet() {
    SiebelPropertySet ps = new SiebelPropertySet();

    ps.setType(CLASS_PROPERTY);

    if(fComments != null)   
      ps.setProperty("Comments", fComments); 

    if(fHI_CHAR1 != null)   
      ps.setProperty("HI_CHAR1", fHI_CHAR1); 

    if(fHI_CHAR2 != null)   
      ps.setProperty("HI_CHAR2", fHI_CHAR2); 

    if(fHI_CHAR3 != null)   
      ps.setProperty("HI_CHAR3", fHI_CHAR3); 

    if(fHI_CHAR4 != null)   
      ps.setProperty("HI_CHAR4", fHI_CHAR4); 

    if(fHI_DATE1 != null)   
      ps.setProperty("HI_DATE1", fHI_DATE1); 

    if(fHI_DATE2 != null)   
      ps.setProperty("HI_DATE2", fHI_DATE2); 

    if(fHI_DATE3 != null)   
      ps.setProperty("HI_DATE3", fHI_DATE3); 

    if(fHI_DATE4 != null)   
      ps.setProperty("HI_DATE4", fHI_DATE4); 

    if(fHI_NUM1 != null)   
      ps.setProperty("HI_NUM1", fHI_NUM1); 

    if(fHI_NUM2 != null)   
      ps.setProperty("HI_NUM2", fHI_NUM2); 

    if(fHI_NUM3 != null)   
      ps.setProperty("HI_NUM3", fHI_NUM3); 

    if(fHI_NUM4 != null)   
      ps.setProperty("HI_NUM4", fHI_NUM4); 

    if(fInactive != null)   
      ps.setProperty("Inactive", fInactive); 

    if(fLO_CHAR1 != null)   
      ps.setProperty("LO_CHAR1", fLO_CHAR1); 

    if(fLO_CHAR2 != null)   
      ps.setProperty("LO_CHAR2", fLO_CHAR2); 

    if(fLO_CHAR3 != null)   
      ps.setProperty("LO_CHAR3", fLO_CHAR3); 

    if(fLO_CHAR4 != null)   
      ps.setProperty("LO_CHAR4", fLO_CHAR4); 

    if(fLO_CHAR5 != null)   
      ps.setProperty("LO_CHAR5", fLO_CHAR5); 

    if(fLO_DATE1 != null)   
      ps.setProperty("LO_DATE1", fLO_DATE1); 

    if(fLO_DATE2 != null)   
      ps.setProperty("LO_DATE2", fLO_DATE2); 

    if(fLO_DATE3 != null)   
      ps.setProperty("LO_DATE3", fLO_DATE3); 

    if(fLO_DATE4 != null)   
      ps.setProperty("LO_DATE4", fLO_DATE4); 

    if(fLO_NUM1 != null)   
      ps.setProperty("LO_NUM1", fLO_NUM1); 

    if(fLO_NUM2 != null)   
      ps.setProperty("LO_NUM2", fLO_NUM2); 

    if(fLO_NUM3 != null)   
      ps.setProperty("LO_NUM3", fLO_NUM3); 

    if(fLO_NUM4 != null)   
      ps.setProperty("LO_NUM4", fLO_NUM4); 

    if(fName != null)   
      ps.setProperty("Name", fName); 

    if(fSequence != null)   
      ps.setProperty("Sequence", fSequence); 

    return ps;
  }/* public SiebelPropertySet toPropertySet(...) */


  public void fromPropertySet(SiebelPropertySet ps) throws SiebelException {
    if((! PS_TYPE_REQUIRED) || (ps.getType().equals(CLASS_PROPERTY))) {
      fComments = ps.getProperty("Comments");
      fHI_CHAR1 = ps.getProperty("HI_CHAR1");
      fHI_CHAR2 = ps.getProperty("HI_CHAR2");
      fHI_CHAR3 = ps.getProperty("HI_CHAR3");
      fHI_CHAR4 = ps.getProperty("HI_CHAR4");
      fHI_DATE1 = ps.getProperty("HI_DATE1");
      fHI_DATE2 = ps.getProperty("HI_DATE2");
      fHI_DATE3 = ps.getProperty("HI_DATE3");
      fHI_DATE4 = ps.getProperty("HI_DATE4");
      fHI_NUM1 = ps.getProperty("HI_NUM1");
      fHI_NUM2 = ps.getProperty("HI_NUM2");
      fHI_NUM3 = ps.getProperty("HI_NUM3");
      fHI_NUM4 = ps.getProperty("HI_NUM4");
      fInactive = ps.getProperty("Inactive");
      fLO_CHAR1 = ps.getProperty("LO_CHAR1");
      fLO_CHAR2 = ps.getProperty("LO_CHAR2");
      fLO_CHAR3 = ps.getProperty("LO_CHAR3");
      fLO_CHAR4 = ps.getProperty("LO_CHAR4");
      fLO_CHAR5 = ps.getProperty("LO_CHAR5");
      fLO_DATE1 = ps.getProperty("LO_DATE1");
      fLO_DATE2 = ps.getProperty("LO_DATE2");
      fLO_DATE3 = ps.getProperty("LO_DATE3");
      fLO_DATE4 = ps.getProperty("LO_DATE4");
      fLO_NUM1 = ps.getProperty("LO_NUM1");
      fLO_NUM2 = ps.getProperty("LO_NUM2");
      fLO_NUM3 = ps.getProperty("LO_NUM3");
      fLO_NUM4 = ps.getProperty("LO_NUM4");
      fName = ps.getProperty("Name");
      fSequence = ps.getProperty("Sequence");

    }else{
     SiebelException se = new SiebelException(1000, 100);  
        se.setDetailMessage("Input PropertySet is not of type [" + 
                            CLASS_PROPERTY + "]");   
        throw se; 
    }/* if */
  }/* public void fromPropertySet(...) */


  /* access methods for fComments */
  public     String getfComments() { 
    return fComments; 
  }/* public     String getfComments(...) */ 

  public     void setfComments(String val) { 
    fComments = val; 
  }/* public     void setfComments(...) */  


  /* access methods for fHI_CHAR1 */
  public     String getfHI_CHAR1() { 
    return fHI_CHAR1; 
  }/* public     String getfHI_CHAR1(...) */ 

  public     void setfHI_CHAR1(String val) { 
    fHI_CHAR1 = val; 
  }/* public     void setfHI_CHAR1(...) */  


  /* access methods for fHI_CHAR2 */
  public     String getfHI_CHAR2() { 
    return fHI_CHAR2; 
  }/* public     String getfHI_CHAR2(...) */ 

  public     void setfHI_CHAR2(String val) { 
    fHI_CHAR2 = val; 
  }/* public     void setfHI_CHAR2(...) */  


  /* access methods for fHI_CHAR3 */
  public     String getfHI_CHAR3() { 
    return fHI_CHAR3; 
  }/* public     String getfHI_CHAR3(...) */ 

  public     void setfHI_CHAR3(String val) { 
    fHI_CHAR3 = val; 
  }/* public     void setfHI_CHAR3(...) */  


  /* access methods for fHI_CHAR4 */
  public     String getfHI_CHAR4() { 
    return fHI_CHAR4; 
  }/* public     String getfHI_CHAR4(...) */ 

  public     void setfHI_CHAR4(String val) { 
    fHI_CHAR4 = val; 
  }/* public     void setfHI_CHAR4(...) */  


  /* access methods for fHI_DATE1 */
  public     String getfHI_DATE1() { 
    return fHI_DATE1; 
  }/* public     String getfHI_DATE1(...) */ 

  public     void setfHI_DATE1(String val) { 
    fHI_DATE1 = val; 
  }/* public     void setfHI_DATE1(...) */  


  /* access methods for fHI_DATE2 */
  public     String getfHI_DATE2() { 
    return fHI_DATE2; 
  }/* public     String getfHI_DATE2(...) */ 

  public     void setfHI_DATE2(String val) { 
    fHI_DATE2 = val; 
  }/* public     void setfHI_DATE2(...) */  


  /* access methods for fHI_DATE3 */
  public     String getfHI_DATE3() { 
    return fHI_DATE3; 
  }/* public     String getfHI_DATE3(...) */ 

  public     void setfHI_DATE3(String val) { 
    fHI_DATE3 = val; 
  }/* public     void setfHI_DATE3(...) */  


  /* access methods for fHI_DATE4 */
  public     String getfHI_DATE4() { 
    return fHI_DATE4; 
  }/* public     String getfHI_DATE4(...) */ 

  public     void setfHI_DATE4(String val) { 
    fHI_DATE4 = val; 
  }/* public     void setfHI_DATE4(...) */  


  /* access methods for fHI_NUM1 */
  public     String getfHI_NUM1() { 
    return fHI_NUM1; 
  }/* public     String getfHI_NUM1(...) */ 

  public     void setfHI_NUM1(String val) { 
    fHI_NUM1 = val; 
  }/* public     void setfHI_NUM1(...) */  


  /* access methods for fHI_NUM2 */
  public     String getfHI_NUM2() { 
    return fHI_NUM2; 
  }/* public     String getfHI_NUM2(...) */ 

  public     void setfHI_NUM2(String val) { 
    fHI_NUM2 = val; 
  }/* public     void setfHI_NUM2(...) */  


  /* access methods for fHI_NUM3 */
  public     String getfHI_NUM3() { 
    return fHI_NUM3; 
  }/* public     String getfHI_NUM3(...) */ 

  public     void setfHI_NUM3(String val) { 
    fHI_NUM3 = val; 
  }/* public     void setfHI_NUM3(...) */  


  /* access methods for fHI_NUM4 */
  public     String getfHI_NUM4() { 
    return fHI_NUM4; 
  }/* public     String getfHI_NUM4(...) */ 

  public     void setfHI_NUM4(String val) { 
    fHI_NUM4 = val; 
  }/* public     void setfHI_NUM4(...) */  


  /* access methods for fInactive */
  public     String getfInactive() { 
    return fInactive; 
  }/* public     String getfInactive(...) */ 

  public     void setfInactive(String val) { 
    fInactive = val; 
  }/* public     void setfInactive(...) */  


  /* access methods for fLO_CHAR1 */
  public     String getfLO_CHAR1() { 
    return fLO_CHAR1; 
  }/* public     String getfLO_CHAR1(...) */ 

  public     void setfLO_CHAR1(String val) { 
    fLO_CHAR1 = val; 
  }/* public     void setfLO_CHAR1(...) */  


  /* access methods for fLO_CHAR2 */
  public     String getfLO_CHAR2() { 
    return fLO_CHAR2; 
  }/* public     String getfLO_CHAR2(...) */ 

  public     void setfLO_CHAR2(String val) { 
    fLO_CHAR2 = val; 
  }/* public     void setfLO_CHAR2(...) */  


  /* access methods for fLO_CHAR3 */
  public     String getfLO_CHAR3() { 
    return fLO_CHAR3; 
  }/* public     String getfLO_CHAR3(...) */ 

  public     void setfLO_CHAR3(String val) { 
    fLO_CHAR3 = val; 
  }/* public     void setfLO_CHAR3(...) */  


  /* access methods for fLO_CHAR4 */
  public     String getfLO_CHAR4() { 
    return fLO_CHAR4; 
  }/* public     String getfLO_CHAR4(...) */ 

  public     void setfLO_CHAR4(String val) { 
    fLO_CHAR4 = val; 
  }/* public     void setfLO_CHAR4(...) */  


  /* access methods for fLO_CHAR5 */
  public     String getfLO_CHAR5() { 
    return fLO_CHAR5; 
  }/* public     String getfLO_CHAR5(...) */ 

  public     void setfLO_CHAR5(String val) { 
    fLO_CHAR5 = val; 
  }/* public     void setfLO_CHAR5(...) */  


  /* access methods for fLO_DATE1 */
  public     String getfLO_DATE1() { 
    return fLO_DATE1; 
  }/* public     String getfLO_DATE1(...) */ 

  public     void setfLO_DATE1(String val) { 
    fLO_DATE1 = val; 
  }/* public     void setfLO_DATE1(...) */  


  /* access methods for fLO_DATE2 */
  public     String getfLO_DATE2() { 
    return fLO_DATE2; 
  }/* public     String getfLO_DATE2(...) */ 

  public     void setfLO_DATE2(String val) { 
    fLO_DATE2 = val; 
  }/* public     void setfLO_DATE2(...) */  


  /* access methods for fLO_DATE3 */
  public     String getfLO_DATE3() { 
    return fLO_DATE3; 
  }/* public     String getfLO_DATE3(...) */ 

  public     void setfLO_DATE3(String val) { 
    fLO_DATE3 = val; 
  }/* public     void setfLO_DATE3(...) */  


  /* access methods for fLO_DATE4 */
  public     String getfLO_DATE4() { 
    return fLO_DATE4; 
  }/* public     String getfLO_DATE4(...) */ 

  public     void setfLO_DATE4(String val) { 
    fLO_DATE4 = val; 
  }/* public     void setfLO_DATE4(...) */  


  /* access methods for fLO_NUM1 */
  public     String getfLO_NUM1() { 
    return fLO_NUM1; 
  }/* public     String getfLO_NUM1(...) */ 

  public     void setfLO_NUM1(String val) { 
    fLO_NUM1 = val; 
  }/* public     void setfLO_NUM1(...) */  


  /* access methods for fLO_NUM2 */
  public     String getfLO_NUM2() { 
    return fLO_NUM2; 
  }/* public     String getfLO_NUM2(...) */ 

  public     void setfLO_NUM2(String val) { 
    fLO_NUM2 = val; 
  }/* public     void setfLO_NUM2(...) */  


  /* access methods for fLO_NUM3 */
  public     String getfLO_NUM3() { 
    return fLO_NUM3; 
  }/* public     String getfLO_NUM3(...) */ 

  public     void setfLO_NUM3(String val) { 
    fLO_NUM3 = val; 
  }/* public     void setfLO_NUM3(...) */  


  /* access methods for fLO_NUM4 */
  public     String getfLO_NUM4() { 
    return fLO_NUM4; 
  }/* public     String getfLO_NUM4(...) */ 

  public     void setfLO_NUM4(String val) { 
    fLO_NUM4 = val; 
  }/* public     void setfLO_NUM4(...) */  


  /* access methods for fName */
  public     String getfName() { 
    return fName; 
  }/* public     String getfName(...) */ 

  public     void setfName(String val) { 
    fName = val; 
  }/* public     void setfName(...) */  


  /* access methods for fSequence */
  public     String getfSequence() { 
    return fSequence; 
  }/* public     String getfSequence(...) */ 

  public     void setfSequence(String val) { 
    fSequence = val; 
  }/* public     void setfSequence(...) */  




  /* member variables */
  protected String  fComments = null;
  protected String  fHI_CHAR1 = null;
  protected String  fHI_CHAR2 = null;
  protected String  fHI_CHAR3 = null;
  protected String  fHI_CHAR4 = null;
  protected String  fHI_DATE1 = null;
  protected String  fHI_DATE2 = null;
  protected String  fHI_DATE3 = null;
  protected String  fHI_DATE4 = null;
  protected String  fHI_NUM1 = null;
  protected String  fHI_NUM2 = null;
  protected String  fHI_NUM3 = null;
  protected String  fHI_NUM4 = null;
  protected String  fInactive = null;
  protected String  fLO_CHAR1 = null;
  protected String  fLO_CHAR2 = null;
  protected String  fLO_CHAR3 = null;
  protected String  fLO_CHAR4 = null;
  protected String  fLO_CHAR5 = null;
  protected String  fLO_DATE1 = null;
  protected String  fLO_DATE2 = null;
  protected String  fLO_DATE3 = null;
  protected String  fLO_DATE4 = null;
  protected String  fLO_NUM1 = null;
  protected String  fLO_NUM2 = null;
  protected String  fLO_NUM3 = null;
  protected String  fLO_NUM4 = null;
  protected String  fName = null;
  protected String  fSequence = null;
}/* Repository_WF_Branch_Criteria_ValueIC */






