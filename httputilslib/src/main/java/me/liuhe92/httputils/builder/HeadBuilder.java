package me.liuhe92.httputils.builder;

import me.liuhe92.httputils.OkHttpUtils;
import me.liuhe92.httputils.request.OtherRequest;
import me.liuhe92.httputils.request.RequestCall;

/**
 * Created by zhy on 16/3/2.
 */
public class HeadBuilder extends GetBuilder
{
    @Override
    public RequestCall build()
    {
        return new OtherRequest(null, null, OkHttpUtils.METHOD.HEAD, url, tag, params, headers,id).build();
    }
}
