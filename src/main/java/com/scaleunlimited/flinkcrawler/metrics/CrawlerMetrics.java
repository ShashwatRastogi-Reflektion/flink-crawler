package com.scaleunlimited.flinkcrawler.metrics;


public enum CrawlerMetrics {

    GAUGE_URLS_CURRENTLY_BEING_FETCHED("URLsCurrentlyBeingFetched"),
    GAUGE_URLS_IN_FETCH_QUEUE("URLsInFetchQueue");

    private String _name;

	CrawlerMetrics(String name) {
    	_name = name;
    }
	
	@Override
	public String toString() {
		return _name;
	}
	
}