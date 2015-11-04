<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html>
<head>
    <base href="<%=basePath%>">
   <title>irubc</title>
    <!-- BOOTSTRAP -->
    <link href="assets/css/bootstrap.css" rel="stylesheet">

    <!-- PAXADMIN CSS -->
    <link href="assets/css/style.css" rel="stylesheet">
    <link href="assets/css/style-responsive.css" rel="stylesheet">

    <!-- VENDOR -->
    <link href="assets/css/animate.css" rel="stylesheet">
    <link href="assets/font-awesome/css/font-awesome.min.css" rel="stylesheet">

</head>


<!-- BODY -->

<body>

    <!-- BEGIN PAGE -->
    <div class="container">
        <!-- BEGIN CONTENT -->
        <div class="right content-page">

			<%@include file="top.jsp" %>

            <!-- ============================================================== -->
            <!-- START CONTENT HERE -->
            <!-- ============================================================== -->
            <div class="body content rows scroll-y">
                <div class="btn-toolbar">
                    <button data-toggle="modal" data-target="#tan" type="button" class="btn btn-primary btn-xs"><span class="glyphicon glyphicon-eye-open" aria-hidden="true"></span> 查看并审核</button>
                    <button data-toggle="modal" data-target="#tan3" type="button" class="btn btn-success btn-xs"><span class="glyphicon glyphicon-plus" aria-hidden="true"></span> 添加课题</button>
                    <button data-toggle="modal" data-target="#groupsDel" type="button" class="btn btn-danger btn-xs"><span class="glyphicon glyphicon-trash" aria-hidden="true"></span> 删除</button>
                </div>
                <table width="100%" cellspacing="0" class="table table-bordered table-hover">
                    <thead>
                        <tr>
                            <th style="width:30px;"><input type="checkbox" group="id" class="checkboxCtrl"></th>
                            <th>讲师编号</th>
                            <th>讲师姓名</th>
                            <th>讲师类型</th>
                            <th>认证状态</th>
                            <th>联系电话</th>
                            <th>教龄</th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <th><input type="checkbox" group="id" class="checkboxCtrl"></th>
                            <td>csbh0001</td>
                            <td>百富</td><td class="firstLetterUpper">PAX</td>
                            <td>郭先生</td><td>15900000000</td>
                            <td>andy@paxdata.com</td>
                        </tr>
                        <tr>
                            <th><input type="checkbox" group="id" class="checkboxCtrl"></th>
                            <td>csbh0001</td>
                            <td>百富</td><td class="firstLetterUpper">PAX</td>
                            <td>郭先生</td><td>15900000000</td>
                            <td>andy@paxdata.com</td>
                        </tr>
                        <tr>
                            <th><input type="checkbox" group="id" class="checkboxCtrl"></th>
                            <td>csbh0001</td>
                            <td>百富</td><td class="firstLetterUpper">PAX</td>
                            <td>郭先生</td><td>15900000000</td>
                            <td>andy@paxdata.com</td>
                        </tr>
                        <tr>
                            <th><input type="checkbox" group="id" class="checkboxCtrl"></th>
                            <td>csbh0001</td>
                            <td>百富</td><td class="firstLetterUpper">PAX</td>
                            <td>郭先生</td><td>15900000000</td>
                            <td>andy@paxdata.com</td>
                        </tr>
                        <tr>
                            <th><input type="checkbox" group="id" class="checkboxCtrl"></th>
                            <td>csbh0001</td>
                            <td>百富</td><td class="firstLetterUpper">PAX</td>
                            <td>郭先生</td><td>15900000000</td>
                            <td>andy@paxdata.com</td>
                        </tr>
                    </tbody>
                </table>
                <div class="text-right">
                  <ul class="pagination">
                    <li>
                      <a href="#" aria-label="Previous">
                        <span aria-hidden="true">&laquo;</span>
                      </a>
                    </li>
                    <li><a href="#">1</a></li>
                    <li><a href="#">2</a></li>
                    <li><a href="#">3</a></li>
                    <li><a href="#">4</a></li>
                    <li><a href="#">5</a></li>
                    <li>
                      <a href="#" aria-label="Next">
                        <span aria-hidden="true">&raquo;</span>
                      </a>
                    </li>
                  </ul>
                </div>
                <!---table end-->
                

                <!-- Footer -->
                <footer>

                    <div class="alert alert-info">
                        <a href="#" class="btn btn-xs btn-primary pull-right">do an action</a>
                        <strong>Info:</strong> you should do an action.
                    </div>

                    <div class="alert alert-warning">
                        <a href="#" class="btn btn-xs btn-warning pull-right">do an action</a>
                        <strong>Warning:</strong> you should do an action.
                    </div>

                    <div class="alert alert-danger">
                        <a href="#" class="btn btn-xs btn-danger pull-right">don't do an action</a>
                        <strong>Danger:</strong> you shouldn't do an action!
                    </div>
                    <div id="morris-donut-chart"></div>              
                </footer>
                <!-- End Footer -->

            </div>
            <!-- ============================================================== -->
            <!-- END CONTENT HERE -->
            <!-- ============================================================== -->


        </div>
        <!-- END CONTENT -->
    </div>
    <!-- End div .container -->
    <!-- END PAGE -->
	
	<!---删除的弹框-->
	<div aria-hidden="true" style="display: none;" id="groupsDel" class="modal fade">
	  <div class="modal-dialog">
	    <div class="modal-content">
	      <div class="modal-header">
	        <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">×</span><span class="sr-only">Close</span></button>
	        <h4 class="modal-title">警告</h4>
	      </div>
	      <div class="modal-body">
	        <p>确定要删除此条信息吗?</p>
	      </div>
	      <div class="modal-footer">
	        <button type="button" class="btn btn-default btn-xs" data-dismiss="modal">取消</button>
	        <a class="btn btn-primary btn-xs" href="javascript:void(0)" data-dismiss="modal">确定</a>
	      </div>
	    </div><!-- /.modal-content -->
	  </div><!-- /.modal-dialog -->
	</div>
    
    
    <!---弹框-->
	<div aria-hidden="true" style="display: none;" id="tan" class="modal fade">
	  <div class="modal-dialog modal-lg">
	    <div class="modal-content">
	      <div class="modal-header">
	        <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">×</span><span class="sr-only">Close</span></button>
	        <h4 class="modal-title">查看讲师</h4>
	      </div>
	      <div class="modal-body">
	        <div class="form-horizontal">
                <div class="form-group">
                      <label for="ds_host" class="col-sm-2 control-label " ><span class="text-danger">*</span>讲师真实姓名</label>
                      <div class="col-sm-4">
                         <input type="text"  id="ds_host" class="form-control" readonly/>
                      </div>
                      <label for="ds_name" class="col-sm-2 control-label"><span class="text-danger">*</span>讲师类别</label>
                      <div class="col-sm-4">
                         <select class="form-control" disabled="disabled" >
						  	<option>学霸</option>
						  	<option>名师</option>
						</select>
                      </div>
                   </div>
                  <div class="form-group">
                      <label for="ds_name" class="col-sm-2 control-label">认证状态</label>
                     <div class="col-sm-4">
                         <select class="form-control" disabled="disabled" >
						  	<option>审核中</option>
						  	<option>审核通过</option>
						  	<option>审核不通过</option>
						</select>
                      </div>
                      <label for="ds_host" class="col-sm-2 control-label">联系电话</label>
                      <div class="col-sm-4">
                         <input type="text" id="ds_host" class="form-control" readonly/>
                      </div>
                   </div>
                   <div class="form-group">
                      
                      <label for="ds_name" class="col-sm-2 control-label">自评标签</label>
                      <div class="col-sm-4">
                         <label class="checkbox-inline">
						  <input type="checkbox" id="inlineCheckbox1" value="option1" disabled="disabled"> 活泼开朗
						</label>
						<label class="checkbox-inline">
						  <input type="checkbox" id="inlineCheckbox2" value="option2" disabled="disabled"> 活泼开朗
						</label>
						<label class="checkbox-inline">
						  <input type="checkbox" id="inlineCheckbox3" value="option3" disabled="disabled"> 活泼开朗
						</label>
                      </div>
                   </div>
                  <div class="form-group">
                      <label for="ds_host" class="col-sm-2 control-label">教龄</label>
                      <div class="col-sm-4">
                     	<select class="form-control" disabled="disabled" >
						  	<option>1年以下</option>
						  	<option>1~3年</option>
						  	<option>3~5年</option>
						  	<option>5年以上</option>
						</select>
						</div>
                   </div>
                  <div class="form-group">
                      <label for="ds_host" class="col-sm-2 control-label">一句话简介</label>
                      <div class="col-sm-10">
                         <input type="text"  id="ds_host" class="form-control" readonly/>
                      </div>
                  </div>
                  <div class="form-group">
                      <label for="ds_host" class="col-sm-2 control-label">讲师详细介绍</label>
                      <div class="col-sm-10">
                        <textarea class="form-control" rows="3" readonly></textarea>
                      </div>
                  </div>
                  <div class="form-group">
                      <label for="ds_host" class="col-sm-2 control-label">教学经历</label>
                      <div class="col-sm-3">
                        <input type="text"  id="ds_host" class="form-control"  placeholder="开始时间" readonly/>
                      </div>
                      <div class="col-sm-3">
                        <input type="text"  id="ds_host" class="form-control"  placeholder="结束时间" readonly/>
                      </div>
                      <div class="col-sm-4">
                        <input type="text"  id="ds_host" class="form-control" placeholder="具体内容" readonly/>
                      </div>
                  </div>
                  <div class="form-group">
                      <label for="ds_host" class="col-sm-2 control-label"></label>
                      <div class="col-sm-3">
                        <input type="text"  id="ds_host" class="form-control"  placeholder="开始时间" readonly/>
                      </div>
                      <div class="col-sm-3">
                        <input type="text"  id="ds_host" class="form-control"  placeholder="结束时间" readonly/>
                      </div>
                      <div class="col-sm-4">
                        <input type="text"  id="ds_host" class="form-control" placeholder="具体内容" readonly/>
                      </div>
                  </div>
                  <div class="form-group">
                      <label for="ds_host" class="col-sm-2 control-label"></label>
                      <div class="col-sm-3">
                        <input type="text"  id="ds_host" class="form-control"  placeholder="开始时间" readonly/>
                      </div>
                      <div class="col-sm-3">
                        <input type="text"  id="ds_host" class="form-control"  placeholder="结束时间" readonly/>
                      </div>
                      <div class="col-sm-4">
                        <input type="text"  id="ds_host" class="form-control" placeholder="具体内容" readonly/>
                      </div>
                  </div>
                  <div class="form-group">
                        <label for="ds_host" class="col-sm-2 control-label">个人照片</label>
                        
                   </div>
                   <div class="form-group">
                        <label for="ds_host" class="col-sm-2 control-label">证书图片</label>
                   </div>
                   <div class="form-group">
                        <label for="ds_host" class="col-sm-2 control-label">身份证</label>
                   </div>
            </div>
	      </div>
	      <div style=" margin-top:0;" class="modal-footer">
	        <button type="button" class="btn btn-default btn-xs" data-dismiss="modal">取消</button>
	        <a class="btn btn-primary btn-xs" href="javascript:void(0)" data-dismiss="modal">提交</a>
	      </div>
	    </div><!-- /.modal-content -->
	  </div><!-- /.modal-dialog -->
	</div>
		<!---弹框-->
	<div aria-hidden="true" style="display: none;" id="tan3" class="modal fade">
	  <div class="modal-dialog modal-lg">
	    <div class="modal-content">
	      <div class="modal-header">
	        <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">×</span><span class="sr-only">Close</span></button>
	        <h4 class="modal-title">增加课题</h4>
	      </div>
	      <div class="modal-body">
	        <div class="form-horizontal">
	        	 <div class="form-group">
                      <label for="ds_host" class="col-sm-2 control-label"><span class="text-danger">*</span>讲师姓名</label>
                      <div class="col-sm-4">
                         <input type="text"  id="ds_host" class="form-control">
                      </div>
                   </div>
                <div class="form-group">
                      <label for="ds_host" class="col-sm-2 control-label"><span class="text-danger">*</span>课题名称</label>
                      <div class="col-sm-4">
                         <input type="text"  id="ds_host" class="form-control">
                      </div>
                   </div>
                  <div class="form-group">
                      <label for="ds_name" class="col-sm-2 control-label"><span class="text-danger">*</span>课题描述</label>
                      <div class="col-sm-10">
                        <textarea class="form-control" rows="3"></textarea>
                      </div>
                   </div>
            </div>
	      </div>
	      <div style=" margin-top:0;" class="modal-footer">
	        <button type="button" class="btn btn-default btn-xs" data-dismiss="modal">取消</button>
	        <a class="btn btn-primary btn-xs" href="javascript:void(0)" data-dismiss="modal">提交</a>
	      </div>
	    </div><!-- /.modal-content -->
	  </div><!-- /.modal-dialog -->
	</div>
    <!--
    ================================================
    JAVASCRIPT
    ================================================
    -->
    <script src="assets/js/jquery.js" type="text/javascript"></script>
    <script src="assets/js/bootstrap.min.js" type="text/javascript"></script>
</body>
</html>