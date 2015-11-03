<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<head>
    <title>Dashboard</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="apple-mobile-web-app-capable" content="yes" />
    <meta name="description" content="">
    <meta name="keywords" content="">
    <meta name="author" content="">

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
                    <button data-toggle="modal" data-target="#tan1" type="button" class="btn btn-primary btn-xs"><span class="glyphicon glyphicon-eye-open" aria-hidden="true"></span> 查看</button>
                    <button data-toggle="modal" data-target="#tan2" type="button" class="btn btn-success btn-xs"><span class="glyphicon glyphicon-plus" aria-hidden="true"></span> 添加</button>
                    <button data-toggle="modal" data-target="#tan3" type="button" class="btn btn-info btn-xs"><span class="glyphicon glyphicon-edit" aria-hidden="true"></span> 编辑</button>
                    <button data-toggle="modal" data-target="#groupsDel" type="button" class="btn btn-danger btn-xs"><span class="glyphicon glyphicon-trash" aria-hidden="true"></span> 删除</button>
                </div>
                <table width="100%" cellspacing="0" class="table table-bordered table-hover">
                    <thead>
                        <tr>
                            <th style="width:30px;"><input type="checkbox" group="id" class="checkboxCtrl"></th>
                            <th>教室编号</th>
                            <th>教室地址</th>
                            <th>教室容量</th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <th><input type="checkbox" group="id" class="checkboxCtrl"></th>
                            <td>1</td>
                            <td>理四421</td>
                            <td>50</td>
                        </tr>
                        <tr>
                            <th><input type="checkbox" group="id" class="checkboxCtrl"></th>
                            <td>1</td>
                            <td>理四421</td>
                            <td>50</td>
                        </tr>
                        <tr>
                            <th><input type="checkbox" group="id" class="checkboxCtrl"></th>
                            <td>1</td>
                            <td>理四421</td>
                            <td>66</td>
                        </tr>
                        <tr>
                             <th><input type="checkbox" group="id" class="checkboxCtrl"></th>
                            <td>1</td>
                            <td>理四421</td>
                            <td>50</td>
                        </tr>
                        <tr>
                            <th><input type="checkbox" group="id" class="checkboxCtrl"></th>
                            <td>1</td>
                            <td>理四421</td>
                            <td>100</td>
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
	<div aria-hidden="true" style="display: none;" id="tan2" class="modal fade">
	  <div class="modal-dialog modal-lg">
	    <div class="modal-content">
	      <div class="modal-header">
	        <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">×</span><span class="sr-only">Close</span></button>
	        <h4 class="modal-title">添加教室</h4>
	      </div>
	      <div class="modal-body">
	        <div class="form-horizontal">
                <div class="form-group">
                      <label for="ds_name" class="col-sm-2 control-label"><span class="text-danger">*</span>教室地址</label>
                      <div class="col-sm-4">
                         <input type="text" id="ds_name" class="form-control">
                      </div>
                   </div>
                  <div class="form-group">
                      <label for="ds_host" class="col-sm-2 control-label"><span class="text-danger">*</span>教室容量</label>
                      <div class="col-sm-4">
                         <input type="text" id="ds_host" class="form-control">
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
	</div>  <!---弹框-->
	<div aria-hidden="true" style="display: none;" id="tan3" class="modal fade">
	  <div class="modal-dialog modal-lg">
	    <div class="modal-content">
	      <div class="modal-header">
	        <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">×</span><span class="sr-only">Close</span></button>
	        <h4 class="modal-title">编辑教室</h4>
	      </div>
	      <div class="modal-body">
	        <div class="form-horizontal">
                <div class="form-group">
                      <label for="ds_name" class="col-sm-2 control-label"><span class="text-danger">*</span>教室地址</label>
                      <div class="col-sm-4">
                         <input type="text" id="ds_name" class="form-control">
                      </div>
                   </div>
                  <div class="form-group">
                      <label for="ds_host" class="col-sm-2 control-label"><span class="text-danger">*</span>教室容量</label>
                      <div class="col-sm-4">
                         <input type="text" id="ds_host" class="form-control">
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
    
    <!---弹框-->
	<div aria-hidden="true" style="display: none;" id="tan1" class="modal fade">
	  <div class="modal-dialog modal-lg">
	    <div class="modal-content">
	      <div class="modal-header">
	        <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">×</span><span class="sr-only">Close</span></button>
	        <h4 class="modal-title">查看教室</h4>
	      </div>
	      <div class="modal-body">
	        <div class="form-horizontal">
	        		<div class="form-group">
                      <label for="ds_host" class="col-sm-2 control-label"><span class="text-danger">*</span>教室编号</label>
                      <div class="col-sm-4">
                         <input type="text" id="ds_host" class="form-control" readonly="readonly">
                      </div>
                   </div>
               	   <div class="form-group">
                      <label for="ds_name" class="col-sm-2 control-label"><span class="text-danger">*</span>教室地址</label>
                      <div class="col-sm-4">
                         <input type="text" id="ds_name" class="form-control" readonly="readonly">
                      </div>
                   </div>
                  <div class="form-group">
                      <label for="ds_host" class="col-sm-2 control-label"><span class="text-danger">*</span>教室容量</label>
                      <div class="col-sm-4">
                         <input type="text" id="ds_host" class="form-control" readonly="readonly">
                      </div>
                   </div>
               </div>
	      </div>
	      <div style=" margin-top:0;" class="modal-footer">
	        <button type="button" class="btn btn-default btn-xs" data-dismiss="modal">关闭</button>
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