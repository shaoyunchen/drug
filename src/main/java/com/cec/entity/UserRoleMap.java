package com.cec.entity;

import java.util.Date;

public class UserRoleMap {
    private String empNo;

    private String roleId;

    private Long statusCd;

    private String createdBy;

    private Date createdDate;

    private String updatedBy;

    private Date updatedDate;

    private String disabledBy;

    private Date disabledDate;

    public String getEmpNo() {
        return empNo;
    }

    public void setEmpNo(String empNo) {
        this.empNo = empNo == null ? null : empNo.trim();
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId == null ? null : roleId.trim();
    }

    public Long getStatusCd() {
        return statusCd;
    }

    public void setStatusCd(Long statusCd) {
        this.statusCd = statusCd;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy == null ? null : createdBy.trim();
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy == null ? null : updatedBy.trim();
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }

    public String getDisabledBy() {
        return disabledBy;
    }

    public void setDisabledBy(String disabledBy) {
        this.disabledBy = disabledBy == null ? null : disabledBy.trim();
    }

    public Date getDisabledDate() {
        return disabledDate;
    }

    public void setDisabledDate(Date disabledDate) {
        this.disabledDate = disabledDate;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"empNo\":\"")
                .append(empNo).append('\"');
        sb.append(",\"roleId\":\"")
                .append(roleId).append('\"');
        sb.append(",\"statusCd\":")
                .append(statusCd);
        sb.append(",\"createdBy\":\"")
                .append(createdBy).append('\"');
        sb.append(",\"createdDate\":\"")
                .append(createdDate).append('\"');
        sb.append(",\"updatedBy\":\"")
                .append(updatedBy).append('\"');
        sb.append(",\"updatedDate\":\"")
                .append(updatedDate).append('\"');
        sb.append(",\"disabledBy\":\"")
                .append(disabledBy).append('\"');
        sb.append(",\"disabledDate\":\"")
                .append(disabledDate).append('\"');
        sb.append('}');
        return sb.toString();
    }
}