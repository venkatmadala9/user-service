package com.lodging.hotel.entity;

public abstract class AbstractBaseEntity
implements java.io.Serializable
{
    protected Long oid;
    
    public AbstractBaseEntity()
    {
        super();
        initialize();
    }
    
    protected void initialize()
    {
        initializeIdentity();
    }
    
    protected void initializeIdentity()
    {
        this.oid = null;
    }

    public Long getOid()
    {
        return oid;
    }

    public void setOid(Long oid)
    {
        this.oid = oid;
    }
    
    public boolean isPersistent()
    {
        return oid != null;
    }

    public String getOidString()
    {
        return String.valueOf(getOid());
    }
    
    public boolean isOrphan()
    {
    	return true;
    }
}
