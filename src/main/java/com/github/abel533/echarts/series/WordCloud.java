package com.github.abel533.echarts.series;

import com.github.abel533.echarts.code.SeriesType;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

@Getter
@Setter
public class WordCloud
  extends Series<WordCloud>
{

  private Object[] center;
  private Object[] size;
  private List<Integer> textRotation;
  private AutoSize autoSize;
  private Integer textPadding;
  
  public WordCloud()
  {
    this.type(SeriesType.wordCloud);
  }
  
  public WordCloud(String name)
  {
    super(name);
    this.type(SeriesType.wordCloud);
  }
  
  public WordCloud textPadding(Integer textPadding)
  {
    this.textPadding = textPadding;
    return this;
  }
  
  public Integer textPadding()
  {
    return this.textPadding;
  }
  
  public WordCloud center(Object val1, Object val2)
  {
    this.center = new Object[2];
    this.center[0] = val1;
    this.center[1] = val2;
    return this;
  }
  
  public Object[] center()
  {
    if (this.center == null) {
      this.center = new Object[2];
    }
    return this.center;
  }
  
  public WordCloud size(Object val1, Object val2)
  {
    this.size = new Object[2];
    this.size[0] = val1;
    this.size[1] = val2;
    return this;
  }
  
  public Object[] size()
  {
    if (this.size == null) {
      this.size = new Object[2];
    }
    return this.size;
  }
  
  public WordCloud textRotation(Integer... textRotation)
  {
    if ((textRotation == null) || (textRotation.length == 0)) {
      return this;
    }
    textRotation().addAll(Arrays.asList(textRotation));
    return this;
  }
  
  public List<Integer> textRotation()
  {
    if (this.textRotation == null) {
      this.textRotation = new LinkedList<Integer>();
    }
    return this.textRotation;
  }
  
  public WordCloud autoSize(AutoSize autoSize)
  {
    this.autoSize = autoSize;
    return this;
  }
  
  public AutoSize autoSize()
  {
    if (this.autoSize == null) {
      this.autoSize = new AutoSize();
    }
    return this.autoSize;
  }
  
  public Object[] getCenter()
  {
    return this.center;
  }
  
  public void setCenter(Object[] center)
  {
    this.center = center;
  }
  
  public Object[] getSize()
  {
    return this.size;
  }
  
  public void setSize(Object[] size)
  {
    this.size = size;
  }
  
  public List<Integer> getTextRotation()
  {
    return this.textRotation;
  }
  
  public void setTextRotation(List<Integer> textRotation)
  {
    this.textRotation = textRotation;
  }
  
  public AutoSize getAutoSize()
  {
    return this.autoSize;
  }
  
  public void setAutoSize(AutoSize autoSize)
  {
    this.autoSize = autoSize;
  }
  
  public Integer getTextPadding()
  {
    return this.textPadding;
  }
  
  public void setTextPadding(Integer textPadding)
  {
    this.textPadding = textPadding;
  }
  
  public static class AutoSize
    implements Serializable
  {
    private static final long serialVersionUID = 1L;
    private Boolean enable;
    private Integer minSize;
    
    public AutoSize() {}
    
    public AutoSize(Boolean enable, Integer minSize)
    {
      this.enable = enable;
      this.minSize = minSize;
    }
    
    public AutoSize enable(Boolean enable)
    {
      this.enable = enable;
      return this;
    }
    
    public Boolean enable()
    {
      return this.enable;
    }
    
    public AutoSize minSize(Integer minSize)
    {
      this.minSize = minSize;
      return this;
    }
    
    public Integer minSize()
    {
      return this.minSize;
    }
    
    public Boolean getEnable()
    {
      return this.enable;
    }
    
    public void setEnable(Boolean enable)
    {
      this.enable = enable;
    }
    
    public Integer getMinSize()
    {
      return this.minSize;
    }
    
    public void setMinSize(Integer minSize)
    {
      this.minSize = minSize;
    }
  }
}