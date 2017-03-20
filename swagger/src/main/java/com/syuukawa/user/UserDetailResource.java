package com.syuukawa.user;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.*;

/**
 * <p>ClassName: UserDetailResource</p>
 * <p>Company: 指点无限(北京)科技有限公司   http://www.zhidianwuxian.cn</p>
 * <p>Description: 这里用一句话描述这个方法的作用</p>
 * <p>author zhouhe</p>
 * <p>date 2017/3/17 14:21</p>
 */
@Path("/user")
@Api(value = "/userResource", description = "description")
@SuppressWarnings("all")
public class UserDetailResource {
    private static final Logger log = LoggerFactory.getLogger(UserDetailResource.class);

    /**
     * <p>Description: 这里用一句话描述这个方法的作用</p>
     * <p>param </p>
     * <p>author zhouhe </p>
     * <p>date 2017/3/17 14:28 </p>
     * <p>return </p>
     */
    @ApiOperation(value = "/detail", notes = "get userDetail by userId")
    @GET
    @Path("/detail")
    @Produces({"application/json;charset=utf-8"})
    @Consumes({"application/json;charset=utf-8"})
    public Response<String> getUserDetail(@QueryParam("userId") Long userId) {
        System.out.println("========="+ userId);
        return  new Response(Result.SUCCESS,userId);
    }
}
