package com.itheima.factory;

import com.itheima.service.MatchService;
import com.itheima.service.OrderService;
import com.itheima.service.impl.MatchServiceimpl;
import com.itheima.service.impl.OrderServiceimpl;
import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

public class MatchDaoFactory {
    public MatchService getMatchService (){
        MatchService matchService = new MatchServiceimpl();
        return matchService;
    }

}
