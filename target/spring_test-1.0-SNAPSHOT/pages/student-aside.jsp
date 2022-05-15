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
				href="${pageContext.request.contextPath}/pages/student-main.jsp"><i
					class="fa fa-dashboard"></i> <span>搜索分类</span></a></li>

			<li class="treeview"><a href="#"> <i class="fa fa-cogs"></i>
					<span>管理</span> <span class="pull-right-container"> <i
						class="fa fa-angle-left pull-right"></i>
				</span>


			</a>
				<ul class="treeview-menu">

					<li><a
						href="${pageContext.request.contextPath}/user/userList"> <i
							class="fa fa-circle-o"></i> 发布项目
					</a></li>
					<li><a
						href="${pageContext.request.contextPath}/showMistakeAnalysis/1.do"> <i
							class="fa fa-circle-o"></i> 项目分类
					</a></li>
					<li><a
						href="${pageContext.request.contextPath}/showHistoryScore/1.do"> <i
							class="fa fa-circle-o"></i> 时间表
					</a></li>
				</ul></li>
		</ul>
	</section>
	<!-- /.sidebar -->
</aside>