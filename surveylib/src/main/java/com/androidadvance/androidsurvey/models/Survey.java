package com.androidadvance.androidsurvey.models;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Survey implements Serializable {

    private static final long serialVersionUID= 1L;
  
    @SerializedName("survey_properties")
    @Expose
    private SurveyProperties surveyProperties;
    @SerializedName("questions")
    @Expose
    private List<Question> questions = new ArrayList<Question>();
    
    private Map<String, Question> qmap;

    /**
     *
     * @return
     * The surveyProperties
     */
    public SurveyProperties getSurveyProperties() {
        return surveyProperties;
    }

    /**
     *
     * @param surveyProperties
     * The survey_properties
     */
    public void setSurveyProperties(SurveyProperties surveyProperties) {
        this.surveyProperties = surveyProperties;
    }

    /**
     *
     * @return
     * The questions
     */
    public List<Question> getQuestions() {
        return questions;
    }

    /**
     *
     * @param questions
     * The questions
     */
    public void setQuestions(List<Question> questions) {
        qmap= new HashMap<String, Question>();
        for (Question q : questions)
        {
          // If no ID was assigned to the question generate a random one
          if (q.getQuestionID() == null || q.getQuestionID().equals(""))
            q.setQuestionID(UUID.randomUUID().toString());
          qmap.put(q.getQuestionID(), q);
        }
        this.questions = questions;
    }
    
    /**
     * Retrieve a question from the survey
     * 
     * @param questionID
     * @return the question or null if no question with ID questionID is contained in the survey
     */
    public Question getQuestion(String questionID)
    {
      return qmap.get(questionID);
    }

}