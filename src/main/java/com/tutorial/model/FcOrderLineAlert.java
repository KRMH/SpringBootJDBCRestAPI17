package com.tutorial.model;

public class FcOrderLineAlert {
private Long id;
	
private Long orderLineId;
private Long alertId;

public FcOrderLineAlert(Long id, Long orderLineId, Long alertId) {
	super();
	this.id = id;
	this.orderLineId = orderLineId;
	this.alertId = alertId;
}

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}
public Long getOrderLineId() {
	return orderLineId;
}
public void setOrderLineId(Long orderLineId) {
	this.orderLineId = orderLineId;
}
public Long getAlertId() {
	return alertId;
}
public void setAlertId(Long alertId) {
	this.alertId = alertId;
}

@Override
public String toString() {
	return "FcOrderLineAlert [id=" + id + ", orderLineId=" + orderLineId + ", alertId=" + alertId + "]";
}



}
