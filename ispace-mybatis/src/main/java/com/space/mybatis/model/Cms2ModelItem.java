package com.space.mybatis.model;

public class Cms2ModelItem {
    private Long id;

    private Long modelId;

    private String field;

    private String itemLabel;

    private Long priority;

    private String textSize;

    private String areaRows;

    private String areaCols;

    private Long helpPosition;

    private Long dataType;

    private Long isSingle;

    private Long isChannel;

    private Long isCustom;

    private Long isDisplay;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getModelId() {
        return modelId;
    }

    public void setModelId(Long modelId) {
        this.modelId = modelId;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field == null ? null : field.trim();
    }

    public String getItemLabel() {
        return itemLabel;
    }

    public void setItemLabel(String itemLabel) {
        this.itemLabel = itemLabel == null ? null : itemLabel.trim();
    }

    public Long getPriority() {
        return priority;
    }

    public void setPriority(Long priority) {
        this.priority = priority;
    }

    public String getTextSize() {
        return textSize;
    }

    public void setTextSize(String textSize) {
        this.textSize = textSize == null ? null : textSize.trim();
    }

    public String getAreaRows() {
        return areaRows;
    }

    public void setAreaRows(String areaRows) {
        this.areaRows = areaRows == null ? null : areaRows.trim();
    }

    public String getAreaCols() {
        return areaCols;
    }

    public void setAreaCols(String areaCols) {
        this.areaCols = areaCols == null ? null : areaCols.trim();
    }

    public Long getHelpPosition() {
        return helpPosition;
    }

    public void setHelpPosition(Long helpPosition) {
        this.helpPosition = helpPosition;
    }

    public Long getDataType() {
        return dataType;
    }

    public void setDataType(Long dataType) {
        this.dataType = dataType;
    }

    public Long getIsSingle() {
        return isSingle;
    }

    public void setIsSingle(Long isSingle) {
        this.isSingle = isSingle;
    }

    public Long getIsChannel() {
        return isChannel;
    }

    public void setIsChannel(Long isChannel) {
        this.isChannel = isChannel;
    }

    public Long getIsCustom() {
        return isCustom;
    }

    public void setIsCustom(Long isCustom) {
        this.isCustom = isCustom;
    }

    public Long getIsDisplay() {
        return isDisplay;
    }

    public void setIsDisplay(Long isDisplay) {
        this.isDisplay = isDisplay;
    }
}