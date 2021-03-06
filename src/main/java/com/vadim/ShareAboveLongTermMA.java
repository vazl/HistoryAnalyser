package com.vadim;

public class ShareAboveLongTermMA implements ShareState {
	
	private boolean above;
	private boolean essential;
	
	public ShareAboveLongTermMA(boolean above)
	{
		this.above = above;
		this.essential = true;
	}
	
    public void markDays() 
    {
    	if (above)
    	{
    		System.out.println("Finding days above long term MA ...");
    		StatsCollector.markSimilarDaysAboveLongTermMA(History.days.size());
    	}
    	else
    	{
    		System.out.println("Not looking for days above long term MA ...");
    	}

    }
    
    public void setEssentialState(boolean essential)
    {
       this.essential = essential;
    }
    
    public boolean isEssential()
    {
    	return essential;
    }
    
    public void setPhase(boolean above)
    {
    	this.above = above;
    }
    
    public boolean getPhase()
    {
    	return this.above;
    }

}
