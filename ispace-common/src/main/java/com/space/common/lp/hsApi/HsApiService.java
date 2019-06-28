package com.space.common.lp.hsApi;

import com.space.common.dto.model.RestApiModel;
import com.space.common.dto.star.BasicForm;
import org.springframework.stereotype.Service;


@Service
public interface HsApiService {

	/**
	 * 我的发布资产交易
	 */
	public RestApiModel QueryMyAssertProductListRequest(BasicForm basicForm);


	/**
	 * 我的足迹 ：查询我访问过的撮合项目和机构项目
	 * @param basicForm
	 * @return
	 */
	RestApiModel queryMyFootprintRequest(BasicForm basicForm);

	/**
	 * 3.1.	我的关注（林茜）
	 	功能说明：分页查询我收藏的撮合列表信息，每个项目包含总浏览量和总收藏量，支持项目发布时间倒序以及项目总金额倒序查询。
	 * @param basicForm
	 * @return
	 */
	RestApiModel queryMyCollectionFundinfoListRequest(BasicForm basicForm);

	/**
	 * 3.5.	资产交易详情（丁烁）
	 	功能说明：根据项目ID查询资产交易的详细信息。
	 * @param basicForm
	 * @return
	 */
	RestApiModel queryAssertProductInfoRequest(BasicForm basicForm);

	/**
	 * 3.6.	项目留言查阅（袁勇）
	 	功能说明：由于pc端暂无资产交易的留言功能，目前只提供撮合项目的留言查阅功能。
	 * @param basicForm
	 * @return
	 */
	RestApiModel messageQueryRequest(BasicForm basicForm);

	/**
	 * 3.7.	项目留言提交（袁勇）
	 	功能说明：由于pc端暂无资产交易的留言功能，目前只提供撮合项目的留言提交功能
	 * @param basicForm
	 * @return
	 */
	RestApiModel messageSubmitRequest(BasicForm basicForm);

	/**
	 * 3.8.	项目评分查阅（胡晓阳）
	 	功能说明：根据项目类别查询项目评分情况，支持撮合项目、资产交易项目的评分情况查阅。评分均为5分制（PC端已按照5分制处理）
	 * @param basicForm
	 * @return
	 */
	RestApiModel getScoreInfoRequest(BasicForm basicForm);

	/**
	 * 3.9.	项目评分提交（胡晓阳）
	 	功能说明：针对撮合项目和机构项目可以进行项目评分，并通过接口提交到后台保存
	 * @param basicForm
	 * @return
	 */
	RestApiModel postScoreInfoRequest(BasicForm basicForm);

	/**
	 * 3.11.我的发布撮合（林茜）
	 	功能说明：分页查询所有我发布的撮合项目列表信息，支持发布时间倒序以及金额倒序查询，用户需要登录，传用户账号。
	 * @param basicForm
	 * @return
	 */
	RestApiModel queryMyInfomationListRequest(BasicForm basicForm);

	/**
	 * 3.14.	我的访客（胡晓阳）
	 	功能说明：访问过我发布的撮合项目和机构项目的人员信息。
	 * @param basicForm
	 * @return
	 */
	RestApiModel querymyVisitorRequest(BasicForm basicForm);

	/**
	 * 3.15.我的留言列表（袁勇，留言维度待确认）
	 	功能说明：分页查询我对撮合项目的留言列表情况。
	 * @param basicForm
	 * @return
	 */
	RestApiModel projectWithMessageListRequest(BasicForm basicForm);

	/**
	 * 3.17.	观看历史列表（袁勇）
	 	功能说明：查询会议培训、路演、知识学院浏览情况列表，二级详情页面暂时不做
	 * @param basicForm
	 * @return
	 */
	RestApiModel queryViewRecordPageRequest(BasicForm basicForm);

	/**
	 * 3.18.	离线空间列表（袁勇）
	 	功能说明：查询会议培训、路演、知识学院参与情况列表，二级详情页面暂时不做。
	 * @param basicForm
	 * @return
	 */
	RestApiModel queryJoinRecordPageRequest(BasicForm basicForm);

	/**
	 * 3.19.	站内信列表（林茜）
	 	功能说明：分页查询我的所有站内信列表情况。
	 * @param basicForm
	 * @return
	 */
	RestApiModel queryMsgPageRequest(BasicForm basicForm);

	/**
	 * 3.21.	获取省份接口
	 	功能说明：获取省份数据
	 * @return
	 */
	RestApiModel getProvinceData();

	/**
	 * 3.22.	根据省份获取市区接口
	 	功能说明：获取省份数据。
	 * @param basicForm
	 * @return
	 */
	RestApiModel getCityData(BasicForm basicForm);
}
