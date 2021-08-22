package com.glopusni.lil.sbet.landon.roomreservation.models;

public enum Position {
   HOUSEKEEPING, SECURITY, FRONT_DESK, CONCIERGE;
   
   @Override
   public String toString() {
      switch(this){
        case HOUSEKEEPING : 
            return "HOUSEKEEPING";
        case SECURITY :
            return "SECURITY";
        case FRONT_DESK :
            return "FRONT_DESK";
        case CONCIERGE :
            return "CONCIERGE";
        default : 
            return "";
      }  
   }
}
