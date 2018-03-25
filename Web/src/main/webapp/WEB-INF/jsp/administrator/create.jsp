<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/WEB-INF/jsp/start.jspf" %>
<%--放置特有的css文件--%>
<%@include file="/WEB-INF/jsp/header.jspf" %>
<%--模板的中心区域--%>
<div class="col-md-8 donate-right">
    <div class="donate-top">
        <h3>Personal information</h3>
        <form>
            <div>
                <span>First Name<label>:</label></span>
                <input type="text">
            </div>
            <div class="clearfix"></div>
            <div>
                <span>Last Name<label>:</label></span>
                <input type="text"/>
                <span style="margin-left: 850px;margin-top: -60px; color: red;width: 200px;">错误提示</span>
            </div>
            <div class="clearfix"></div>
            <div>
                <span>Email Address<label>:</label></span>
                <input type="text">
                <span style="margin-left: 850px;margin-top: -60px; color: red;width: 200px;">错误提示</span>
            </div>
            <div class="clearfix"></div>
            <div>
                <span>Address<label>:</label></span>
                <input type="text">
            </div>
            <div class="clearfix"></div>
            <div>
                <span>Credit card No<label>:</label></span>
                <input type="text">
            </div>
            <div class="clearfix"></div>
            <div>
                <span>City<label>:</label></span>
                <input type="text">
            </div>
            <div class="clearfix"></div>
            <div>
                <span>State<label>:</label></span>
                <select name="city">
                    <option value="select your location"> states</option>
                    <option value="saab">location1</option>
                    <option value="fiat">location2</option>
                    <option value="audi">location3</option>
                </select>
            </div>
            <div class="clearfix"></div>
            <div>
                <span>Zip<label>:</label></span>
                <input type="text">
            </div>
            <div class="clearfix"></div>
            <input type="submit" value="Donate">

        </form>
    </div>
    <div class="clearfix"></div>
</div>
<%@include file="/WEB-INF/jsp/footer.jspf" %>
<%--放置特有的js文件--%>
<%@include file="/WEB-INF/jsp/end.jspf" %>

