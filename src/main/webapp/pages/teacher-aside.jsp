<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<aside class="main-sidebar">
	<!-- sidebar: style can be found in sidebar.less -->
	<section class="sidebar">
		<!-- Sidebar user panel -->
		<div class="user-panel">
			<div class="pull-left image">
				<img src="${pageContext.request.contextPath}/img/user2-160x160.jpg"
					class="img-circle" alt="User Image">
			</div>
			<div class="pull-left info">
				<p>
					<security:authentication property="principal.username" />
				</p>
				<a href="#"><i class="fa fa-circle text-success"></i> 已登录</a>
			</div>
		</div>

		<!-- sidebar menu: : style can be found in sidebar.less -->
		<ul class="sidebar-menu">
			<li class="header">菜单</li>
			<li id="admin-index"><a
				href="${pageContext.request.contextPath}/pages/teacher-main.jsp"><i
					class="fa fa-dashboard"></i> <span>用户</span></a></li>

			<li class="treeview"><a href="#"> <i class="fa fa-cogs"></i>
					<span>习题管理</span> <span class="pull-right-container"> <i
						class="fa fa-angle-left pull-right"></i>
				</span>


			</a>
				<ul class="treeview-menu">

					<li><a
						href="${pageContext.request.contextPath}/topic/list"> <i
							class="fa fa-circle-o"></i> 题库管理
					</a></li>
					<li><a
						href="${pageContext.request.contextPath}/paper/listPaper"> <i
							class="fa fa-circle-o"></i> 抽题组卷
					</a></li>
				</ul></li>
		</ul>
	</section>
	<!-- /.sidebar -->
</aside>