/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ke.co.skybill.revenuecollection.gateway.filters;

import com.netflix.zuul.ZuulFilter;

/**
 *
 * @author david
 */
public class ErrorFilter extends ZuulFilter {
 
  @Override
  public String filterType() {
    return "error";
  }
 
  @Override
  public int filterOrder() {
    return 1;
  }
 
  @Override
  public boolean shouldFilter() {
    return true;
  }
 
  @Override
  public Object run() {
   System.out.println("Inside Route Filter");
 
    return null;
  }
}