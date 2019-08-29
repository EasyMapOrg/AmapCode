package com.autonavi.minimap.route.bus.realtimebus.net.param;

import com.amap.bundle.network.request.param.builder.AosURLBuilder;
import com.amap.bundle.network.request.param.builder.ParamEntity;
import com.amap.bundle.network.request.param.builder.URLBuilder.Path;

@Path(builder = AosURLBuilder.class, host = "aos_url", sign = {"adcode", "xy", "lines", "stations"}, url = "ws/mapapi/realtimebus/linestation/")
public class BusRouteRealTimeParam implements ParamEntity {
    public String count;
    public String from_page;
    public String is_refresh;
    public String lines;
    public String need_bus_status;
    public String need_bus_track;
    public String source_type;
    public String stations;
    public String xy;
}
