package com.kyx.app.mybatis.mapper;

import static org.apache.ibatis.jdbc.SqlBuilder.BEGIN;
import static org.apache.ibatis.jdbc.SqlBuilder.DELETE_FROM;
import static org.apache.ibatis.jdbc.SqlBuilder.FROM;
import static org.apache.ibatis.jdbc.SqlBuilder.INSERT_INTO;
import static org.apache.ibatis.jdbc.SqlBuilder.ORDER_BY;
import static org.apache.ibatis.jdbc.SqlBuilder.SELECT;
import static org.apache.ibatis.jdbc.SqlBuilder.SELECT_DISTINCT;
import static org.apache.ibatis.jdbc.SqlBuilder.SET;
import static org.apache.ibatis.jdbc.SqlBuilder.SQL;
import static org.apache.ibatis.jdbc.SqlBuilder.UPDATE;
import static org.apache.ibatis.jdbc.SqlBuilder.VALUES;
import static org.apache.ibatis.jdbc.SqlBuilder.WHERE;

import com.kyx.app.bean.User;
import com.kyx.app.bean.UserExample.Criteria;
import com.kyx.app.bean.UserExample.Criterion;
import com.kyx.app.bean.UserExample;
import java.util.List;
import java.util.Map;

public class UserSqlProvider {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated
     */
    public String countByExample(UserExample example) {
        BEGIN();
        SELECT("count(*)");
        FROM("user");
        applyWhere(example, false);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated
     */
    public String deleteByExample(UserExample example) {
        BEGIN();
        DELETE_FROM("user");
        applyWhere(example, false);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated
     */
    public String insertSelective(User record) {
        BEGIN();
        INSERT_INTO("user");
        
        if (record.getId() != null) {
            VALUES("id", "#{id,jdbcType=BIGINT}");
        }
        
        if (record.getUsername() != null) {
            VALUES("username", "#{username,jdbcType=VARCHAR}");
        }
        
        if (record.getPassword() != null) {
            VALUES("password", "#{password,jdbcType=VARCHAR}");
        }
        
        if (record.getSalt() != null) {
            VALUES("salt", "#{salt,jdbcType=CHAR}");
        }
        
        if (record.getCreatedAt() != null) {
            VALUES("created_at", "#{createdAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getDeletedAt() != null) {
            VALUES("deleted_at", "#{deletedAt,jdbcType=TIMESTAMP}");
        }
        
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated
     */
    public String selectByExample(UserExample example) {
        BEGIN();
        if (example != null && example.isDistinct()) {
            SELECT_DISTINCT("id");
        } else {
            SELECT("id");
        }
        SELECT("username");
        SELECT("password");
        SELECT("salt");
        SELECT("created_at");
        SELECT("deleted_at");
        FROM("user");
        applyWhere(example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            ORDER_BY(example.getOrderByClause());
        }
        
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated
     */
    public String updateByExampleSelective(Map<String, Object> parameter) {
        User record = (User) parameter.get("record");
        UserExample example = (UserExample) parameter.get("example");
        
        BEGIN();
        UPDATE("user");
        
        if (record.getId() != null) {
            SET("id = #{record.id,jdbcType=BIGINT}");
        }
        
        if (record.getUsername() != null) {
            SET("username = #{record.username,jdbcType=VARCHAR}");
        }
        
        if (record.getPassword() != null) {
            SET("password = #{record.password,jdbcType=VARCHAR}");
        }
        
        if (record.getSalt() != null) {
            SET("salt = #{record.salt,jdbcType=CHAR}");
        }
        
        if (record.getCreatedAt() != null) {
            SET("created_at = #{record.createdAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getDeletedAt() != null) {
            SET("deleted_at = #{record.deletedAt,jdbcType=TIMESTAMP}");
        }
        
        applyWhere(example, true);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated
     */
    public String updateByExample(Map<String, Object> parameter) {
        BEGIN();
        UPDATE("user");
        
        SET("id = #{record.id,jdbcType=BIGINT}");
        SET("username = #{record.username,jdbcType=VARCHAR}");
        SET("password = #{record.password,jdbcType=VARCHAR}");
        SET("salt = #{record.salt,jdbcType=CHAR}");
        SET("created_at = #{record.createdAt,jdbcType=TIMESTAMP}");
        SET("deleted_at = #{record.deletedAt,jdbcType=TIMESTAMP}");
        
        UserExample example = (UserExample) parameter.get("example");
        applyWhere(example, true);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated
     */
    public String updateByPrimaryKeySelective(User record) {
        BEGIN();
        UPDATE("user");
        
        if (record.getUsername() != null) {
            SET("username = #{username,jdbcType=VARCHAR}");
        }
        
        if (record.getPassword() != null) {
            SET("password = #{password,jdbcType=VARCHAR}");
        }
        
        if (record.getSalt() != null) {
            SET("salt = #{salt,jdbcType=CHAR}");
        }
        
        if (record.getCreatedAt() != null) {
            SET("created_at = #{createdAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getDeletedAt() != null) {
            SET("deleted_at = #{deletedAt,jdbcType=TIMESTAMP}");
        }
        
        WHERE("id = #{id,jdbcType=BIGINT}");
        
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated
     */
    protected void applyWhere(UserExample example, boolean includeExamplePhrase) {
        if (example == null) {
            return;
        }
        
        String parmPhrase1;
        String parmPhrase1_th;
        String parmPhrase2;
        String parmPhrase2_th;
        String parmPhrase3;
        String parmPhrase3_th;
        if (includeExamplePhrase) {
            parmPhrase1 = "%s #{example.oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{example.oredCriteria[%d].allCriteria[%d].value} and #{example.oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{example.oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{example.oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{example.oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        } else {
            parmPhrase1 = "%s #{oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{oredCriteria[%d].allCriteria[%d].value} and #{oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        }
        
        StringBuilder sb = new StringBuilder();
        List<Criteria> oredCriteria = example.getOredCriteria();
        boolean firstCriteria = true;
        for (int i = 0; i < oredCriteria.size(); i++) {
            Criteria criteria = oredCriteria.get(i);
            if (criteria.isValid()) {
                if (firstCriteria) {
                    firstCriteria = false;
                } else {
                    sb.append(" or ");
                }
                
                sb.append('(');
                List<Criterion> criterions = criteria.getAllCriteria();
                boolean firstCriterion = true;
                for (int j = 0; j < criterions.size(); j++) {
                    Criterion criterion = criterions.get(j);
                    if (firstCriterion) {
                        firstCriterion = false;
                    } else {
                        sb.append(" and ");
                    }
                    
                    if (criterion.isNoValue()) {
                        sb.append(criterion.getCondition());
                    } else if (criterion.isSingleValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase1, criterion.getCondition(), i, j));
                        } else {
                            sb.append(String.format(parmPhrase1_th, criterion.getCondition(), i, j,criterion.getTypeHandler()));
                        }
                    } else if (criterion.isBetweenValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase2, criterion.getCondition(), i, j, i, j));
                        } else {
                            sb.append(String.format(parmPhrase2_th, criterion.getCondition(), i, j, criterion.getTypeHandler(), i, j, criterion.getTypeHandler()));
                        }
                    } else if (criterion.isListValue()) {
                        sb.append(criterion.getCondition());
                        sb.append(" (");
                        List<?> listItems = (List<?>) criterion.getValue();
                        boolean comma = false;
                        for (int k = 0; k < listItems.size(); k++) {
                            if (comma) {
                                sb.append(", ");
                            } else {
                                comma = true;
                            }
                            if (criterion.getTypeHandler() == null) {
                                sb.append(String.format(parmPhrase3, i, j, k));
                            } else {
                                sb.append(String.format(parmPhrase3_th, i, j, k, criterion.getTypeHandler()));
                            }
                        }
                        sb.append(')');
                    }
                }
                sb.append(')');
            }
        }
        
        if (sb.length() > 0) {
            WHERE(sb.toString());
        }
    }
}