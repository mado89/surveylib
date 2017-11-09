package com.androidadvance.androidsurvey.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Question implements Serializable {

    private static final long serialVersionUID= 1L;

    @SerializedName("question_id")
    @Expose
    private String questionID;
    @SerializedName("question_type")
    @Expose
    private String questionType;
    @SerializedName("question_title")
    @Expose
    private String questionTitle;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("required")
    @Expose
    private Boolean required;
    @SerializedName("random_choices")
    @Expose
    private Boolean randomChoices;
    @SerializedName("choices")
    @Expose
    private List<String> choices = new ArrayList<String>();
    @SerializedName("number_of_lines")
    @Expose
    private Integer numberOfLines;

    /**
    *
    * @return
    * The questionID
    */
   public String getQuestionID() {
       return questionType;
   }

   /**
    *
    * @param questionID
    * The question_id
    */
   public void setQuestionID(String questionID) {
     this.questionID = questionID;
       }
   
   /**
     *
     * @return
     * The questionType
     */
    public String getQuestionType() {
        return questionType;
    }

    /**
     *
     * @param questionType
     * The question_type
     */
    public void setQuestionType(String questionType) {
        this.questionType = questionType;
    }

    /**
     *
     * @return
     * The questionTitle
     */
    public String getQuestionTitle() {
        return questionTitle;
    }

    /**
     *
     * @param questionTitle
     * The question_title
     */
    public void setQuestionTitle(String questionTitle) {
        this.questionTitle = questionTitle;
    }

    /**
     *
     * @return
     * The description
     */
    public String getDescription() {
        return description;
    }

    /**
     *
     * @param description
     * The description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     *
     * @return
     * The required
     */
    public Boolean getRequired() {
        return required;
    }

    /**
     *
     * @param required
     * The required
     */
    public void setRequired(Boolean required) {
        this.required = required;
    }

    /**
     *
     * @return
     * The randomChoices
     */
    public Boolean getRandomChoices() {
        return randomChoices;
    }

    /**
     *
     * @param randomChoices
     * The random_choices
     */
    public void setRandomChoices(Boolean randomChoices) {
        this.randomChoices = randomChoices;
    }

    /**
     *
     * @return
     * The choices
     */
    public List<String> getChoices() {
        return choices;
    }

    /**
     *
     * @param choices
     * The choices
     */
    public void setChoices(List<String> choices) {
        this.choices = choices;
    }

    /**
     *
     * @return
     * The numberOfLines
     */
    public Integer getNumberOfLines() {
        return numberOfLines;
    }

    /**
     *
     * @param numberOfLines
     * The number_of_lines
     */
    public void setNumberOfLines(Integer numberOfLines) {
        this.numberOfLines = numberOfLines;
    }

}