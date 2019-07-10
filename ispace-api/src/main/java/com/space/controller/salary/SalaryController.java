package com.space.controller.salary;

import com.space.common.dto.dis.answer.AnswerListResDTO;
import com.space.common.dto.dis.comment.CommentListResDTO;
import com.space.common.dto.dis.follow.FollowResDTO;
import com.space.mybatis.model.Answer;
import com.space.mybatis.model.Comment;
import com.space.mybatis.model.RespBean;
import com.space.mybatis.model.Topic;
import com.space.service.AnswerService;
import com.space.service.CommentService;
import com.space.service.FollowService;
import com.space.service.TopicService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 话题关注管理（后台）
 */
@RestController
@RequestMapping("/salary/sob")
public class SalaryController {

    private final static Logger logger = LoggerFactory.getLogger(SalaryController.class);


    @Autowired
    TopicService topicService;

    @Autowired
    AnswerService answerService;

    @Autowired
    FollowService followService;

    @Autowired
    CommentService commentService;


    /**
     * 新增话题
     * @param salary
     * @return
     */
    @RequestMapping(value = "/salary", method = RequestMethod.POST)
    public RespBean addSalaryCfg(Topic salary) {
        logger.info("开始新增话题");
//                salary.setIcon("");
                salary.setCreateTime(new Date());
                salary.setUT(new Date());
                salary.setCommentCount(0);
                salary.setCollectCount(0);
                salary.setUserId("0");
        if (topicService.save(salary) == 1) {
            return RespBean.ok("添加成功!");
        }
        return RespBean.error("添加失败!");
    }


    /**
     * 查询话题
     * @return
     */
     @RequestMapping(value = "/salary", method = RequestMethod.GET)
    public  Map<String, Object>  salariesByPage(@RequestParam(defaultValue = "1") Integer page, @RequestParam(defaultValue = "10") Integer size)  {
         Map<String, Object> map = new HashMap<>();
         List<Topic> employeeByPage = topicService.listTopic(page, size);
         Integer count = topicService.countForAll();
         map.put("emps", employeeByPage);
         map.put("count", count);
         return map;
    }


    /**
     * 编辑话题
     * @param salary
     * @return
     */
    @RequestMapping(value = "/salary", method = RequestMethod.PUT)
    public RespBean updateSalary(Topic salary) {
        if (topicService.update(salary) == 1) {
            salary.setUT(new Date());
            salary.setUP("1");
            return RespBean.ok("更新成功!");
        }
        return RespBean.error("更新失败!");
    }


    /**
     * 上下架话题
     * @param ids
     * @return
     */
    @RequestMapping(value = "/salary/{ids}", method = RequestMethod.DELETE)
    public RespBean deleteSalary(@PathVariable String ids) {
        String[] split = ids.split(",");
        int flag = 0;
        for(int i = 0 ; i < split.length ; i ++){
            int id = Integer.valueOf(split[i]);
            Topic item = topicService.getById(id);
            int isDeleted = item.getIsDeleted();
            item.setUT(new Date());
            item.setUP("1");

            if(isDeleted == 0){
                item.setIsDeleted(1);
            }else {
                item.setIsDeleted(0);
            }
            flag = topicService.update(item);
        }
        if (flag == 1) {
            return RespBean.ok("上下架成功!");
        }
        return RespBean.error("上下架失败!");
    }



    /**
     * 查询回答列表
     * @return
     */
    @RequestMapping(value = "/answer", method = RequestMethod.GET)
    public Map<String, Object> answerByPage(@RequestParam(defaultValue = "1") Integer page, @RequestParam(defaultValue = "10") Integer size, @RequestParam String name,@RequestParam String topic) {
        Map<String, Object> map = new HashMap<>();
        List<AnswerListResDTO> employeeByPage = answerService.listAnswer(page, size,name,topic);
        Integer count = answerService.countForAll(name,topic);
        map.put("emps", employeeByPage);
        map.put("count", count);
        return map;
    }


    /**
     * 删除回答
     * @param ids
     * @return
     */
    @RequestMapping(value = "/answer/{ids}", method = RequestMethod.DELETE)
    public RespBean deleteAnswer(@PathVariable String ids) {
        String[] split = ids.split(",");
        int flag = 0;
        for(int i = 0 ; i < split.length ; i ++){
            int id = Integer.valueOf(split[i]);
            Answer item = answerService.getById(id);
            int isDeleted = item.getIsDeleted();
            item.setUT(new Date());
            item.setUP("1");
            if(isDeleted == 0){
                item.setIsDeleted(1);
            }else {
                item.setIsDeleted(0);
            }
            flag = answerService.update(item);
        }
        if (flag == 1) {
            return RespBean.ok("上下架成功!");
        }
        return RespBean.error("上下架失败!");
    }


    /**
     * 话题关注人列表
     * @return
     */
     @RequestMapping(value = "/follow", method = RequestMethod.GET)
     public Map<String, Object> follow(@RequestParam(defaultValue = "1") Integer page, @RequestParam(defaultValue = "10") Integer size) {
         Map<String, Object> map = new HashMap<>();
         List<FollowResDTO> employeeByPage = topicService.selectAllFollow(page, size);
         Integer count = followService.countForAll();
         map.put("emps", employeeByPage);
         map.put("count", count);
         return map;
     }


    /**
     * 评论列表
     * @return
     */
     @RequestMapping(value = "/comment", method = RequestMethod.GET)
     public Map<String, Object> comment(@RequestParam(defaultValue = "1") Integer page, @RequestParam(defaultValue = "10") Integer size, @RequestParam String name, @RequestParam String topic, @RequestParam String answer) {
         Map<String, Object> map = new HashMap<>();
         List<CommentListResDTO> employeeByPage = commentService.selectAllComment(page, size, name,topic,answer);
         Integer count = commentService.countForAll(name,topic,answer);
         map.put("emps", employeeByPage);
         map.put("count", count);
         return map;
     }


    /**
     * 上下架评论
     * @param ids
     * @return
     */
    @RequestMapping(value = "/comment/{ids}", method = RequestMethod.DELETE)
    public RespBean deleteComment(@PathVariable String ids) {
        String[] split = ids.split(",");
        int flag = 0;
        for(int i = 0 ; i < split.length ; i ++){
            int id = Integer.valueOf(split[i]);
            Comment item = commentService.getById(id);
            int isDeleted = item.getIsDeleted();
            item.setUT(new Date());
            item.setUP("1");
            if(isDeleted == 0){
                item.setIsDeleted(1);
            }else {
                item.setIsDeleted(0);
            }
            flag = commentService.update(item);
        }
        if (flag == 1) {
            return RespBean.ok("上下架成功!");
        }
        return RespBean.error("上下架失败!");
    }

}
