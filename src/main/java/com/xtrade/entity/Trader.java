package com.xtrade.entity;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created with IntelliJ IDEA.
 * User: jespinoza
 * Date: 11/16/12
 * Time: 5:37 PM
 * To change this template use File | Settings | File Templates.
 */
@XmlRootElement
public class Trader {

    public String name;
    public String address;
    public String website;
    public float coordX;
    public float coordY;
    public String imageLocation;



}
