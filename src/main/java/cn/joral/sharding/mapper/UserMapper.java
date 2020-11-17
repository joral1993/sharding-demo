package cn.joral.sharding.mapper;

import cn.joral.sharding.pojo.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author jiangliang
 * @date 2020/11/10
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
}
