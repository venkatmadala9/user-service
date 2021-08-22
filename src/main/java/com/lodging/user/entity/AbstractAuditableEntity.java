package com.lodging.user.entity;

import java.util.Date;

public abstract class AbstractAuditableEntity
extends AbstractBaseEntity
{
    protected String updatedBy;
    protected Date updatedAt;
    
    @Override
    protected void initialize()
    {
        super.initialize();
        setUpdatedAt(new Date());
		/*
		 * if(ExecutionContext.getCurrent()==null) {
		 * LOGGER.debug("Hello::::getCurrent()isNull::"); ExecutionContext context =
		 * ExecutionContext.newInstance(ExecutionContext.DEFAULT_USER);
		 * context.beCurrent(); } ExecutionContext current =
		 * ExecutionContext.getCurrent(); if(current.getUserID().startsWith("quartz")) {
		 * setUpdatedBy(current.getUserID()); } else {
		 * setUpdatedBy(String.valueOf(current.getUserOid())); }
		 */
    }
    
    public String getUpdatedBy()
    {
        return updatedBy;
    }
    
    public void setUpdatedBy(String updatedBy)
    {
    	this.updatedBy = updatedBy;    	
        
    }
    
    public Date getUpdatedAt()
    {
        return updatedAt;
    }
    
    public void setUpdatedAt(Date updatedAt)
    {
        this.updatedAt = updatedAt;
    }
    
    public void resetDefaultValues()
    {
        setUpdatedAt(new Date());
		/*
		 * if(ExecutionContext.getCurrent()==null) {
		 * LOGGER.debug("Hello::::getCurrent()isNull::"); ExecutionContext context =
		 * ExecutionContext.newInstance(ExecutionContext.DEFAULT_USER);
		 * context.beCurrent(); } ExecutionContext current =
		 * ExecutionContext.getCurrent(); if(current.getUserID().startsWith("quartz")) {
		 * setUpdatedBy(current.getUserID()); } else {
		 * setUpdatedBy(String.valueOf(current.getUserOid())); }
		 */
    }
}
