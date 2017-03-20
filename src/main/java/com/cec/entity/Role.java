package com.cec.entity;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.Date;

public class Role implements GrantedAuthority {
    private String roleId;

    private String name;

    private String description;

    private String statusCd;

    private String createdBy;

    private Date createdDate;

    private String updatedBy;

    private Date updatedDate;

    private String disabledBy;

    private Date disabledDate;

    private String defaultmenu;

    private Integer status;

    private String rolelevel;

    private String duns;

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId == null ? null : roleId.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getStatusCd() {
        return statusCd;
    }

    public void setStatusCd(String statusCd) {
        this.statusCd = statusCd == null ? null : statusCd.trim();
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

    public String getDefaultmenu() {
        return defaultmenu;
    }

    public void setDefaultmenu(String defaultmenu) {
        this.defaultmenu = defaultmenu == null ? null : defaultmenu.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getRolelevel() {
        return rolelevel;
    }

    public void setRolelevel(String rolelevel) {
        this.rolelevel = rolelevel == null ? null : rolelevel.trim();
    }

    public String getDuns() {
        return duns;
    }

    public void setDuns(String duns) {
        this.duns = duns == null ? null : duns.trim();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"roleId\":\"")
                .append(roleId).append('\"');
        sb.append(",\"name\":\"")
                .append(name).append('\"');
        sb.append(",\"description\":\"")
                .append(description).append('\"');
        sb.append(",\"statusCd\":\"")
                .append(statusCd).append('\"');
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
        sb.append(",\"defaultmenu\":\"")
                .append(defaultmenu).append('\"');
        sb.append(",\"status\":")
                .append(status);
        sb.append(",\"rolelevel\":\"")
                .append(rolelevel).append('\"');
        sb.append(",\"duns\":\"")
                .append(duns).append('\"');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public String getAuthority() {
        return "ROLE_"+this.getRoleId();
    }
}