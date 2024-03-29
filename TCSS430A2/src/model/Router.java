package model;

import java.util.ArrayList;
import java.util.Date;

/**
 * 
 * @author Tommy Warren, Devin Durham,
 * @version 6/27/2017
 *
 *A class for each router which contains a list for the ip address, ports, hops, and time stamp 
 */

public class Router {

	private ArrayList<String> ipArr = new ArrayList<String>();
	private ArrayList<Integer> hopsArr = new ArrayList<Integer>();
	private ArrayList<String> portsArr = new ArrayList<String>();
	private ArrayList<String> timeArr = new ArrayList<String>();

	private ArrayList<Router> routerArr = new ArrayList<Router>();


	public String getIPFromIndex(int x) {
		return this.ipArr.get(x);
	}

	public int getHopsFromIndex(int x) {
		return this.hopsArr.get(x);
	}

	public String getPortFromIndex(int x) {
		return this.portsArr.get(x);
	}

	public String getTimeFromIndex(int x) {
		return this.timeArr.get(x);
	}

	public Router getRouterFromIndex(int x) {
		return this.routerArr.get(x);
	}

	public void setRouterArr(Router route) {
		this.routerArr.add(route);
	}

	public ArrayList<Router> getRouterArr() {
		return this.routerArr;
	}

	public ArrayList<String> getIpArr() {
		return this.ipArr;
	}

	public void setIpArr(String ip) {
		this.ipArr.add(ip);
	}

	public ArrayList<Integer> getHopsArr() {
		return this.hopsArr;
	}

	public void setHopsArr(int hops) {
		this.hopsArr.add(hops);
	}

	public ArrayList<String> getPortsArr() {
		return this.portsArr;
	}

	public void setPortsArr(String ports) {
		this.portsArr.add(ports);
	}

	public ArrayList<String> getTimeArr() {
		return this.timeArr;
	}

	public void setTimeArr(Date time) {
		this.timeArr.add(time.toString());
	}

	public void removeIP(int x) {
		this.ipArr.remove(x);
	}

	public void removeHop(int x) {
		this.hopsArr.remove(x);
	}

	public void removePorts(int x) {
		this.portsArr.remove(x);
	}

	public void removeTime(int x) {
		this.timeArr.remove(x);
	}
	

	/**
	 * a simple method to be able to remove a entry form the table given an index (row)
	 * @param x
	 */
	public void removeTableEntryAtIndex(int x) {
		this.timeArr.remove(x);
		this.portsArr.remove(x);
		this.hopsArr.remove(x);
		this.ipArr.remove(x);
	}

	/**
	 * a method to insert an entry into the router table
	 * @param ip
	 * @param hops
	 * @param ports
	 * @param time
	 */
	public void addTableEntry(String ip, int hops, String ports, String time) {
		this.timeArr.add(time);
		this.portsArr.add(ports);
		this.hopsArr.add(hops);
		this.ipArr.add(ip);
	}


}
