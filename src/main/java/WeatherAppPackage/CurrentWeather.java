package WeatherAppPackage;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CurrentWeather {
    public String getLocalObservationDateTime() {
		return localObservationDateTime;
	}
	public long getEpochTime() {
		return epochTime;
	}
	public String getWeatherText() {
		return weatherText;
	}
	public int getWeatherIcon() {
		return weatherIcon;
	}
	public boolean isHasPrecipitation() {
		return hasPrecipitation;
	}
	public String getPrecipitationType() {
		return precipitationType;
	}
	public boolean isDayTime() {
		return isDayTime;
	}
	public TemperatureData getTemperature() {
		return temperature;
	}
	public String getMobileLink() {
		return mobileLink;
	}
	public String getLink() {
		return link;
	}
	@JsonProperty("LocalObservationDateTime")
	private String localObservationDateTime;
	@JsonProperty("EpochTime")
    private long epochTime;
	@JsonProperty("WeatherText")
    private String weatherText;
	@JsonProperty("WeatherIcon")
    private int weatherIcon;
	@JsonProperty("HasPrecipitation")
    private boolean hasPrecipitation;
	@JsonProperty("PrecipitationType")
    private String precipitationType;
	@JsonProperty("IsDayTime")
    private boolean isDayTime;
	@JsonProperty("Temperature")
    private TemperatureData temperature;
    @JsonProperty("MobileLink")
    private String mobileLink;
    @JsonProperty("Link")
    private String link;
    
}
    
    class TemperatureData {
    	  // Getters and setters for the fields
        // ...
        public MetricData getMetric() {
			return metric;
		}
		public ImperialData getImperial() {
			return imperial;
		}
		@JsonProperty("Metric")
		private MetricData metric;
		@JsonProperty("Imperial")
        private ImperialData imperial;
        
        
    }

    class MetricData {
        public double getValue() {
			return value;
		}
		public String getUnit() {
			return unit;
		}
		public int getUnitType() {
			return unitType;
		}
		@JsonProperty("Value")
		private double value;
		@JsonProperty("Unit")
        private String unit;
		@JsonProperty("UnitType")
        private int unitType;
        
        // Getters and setters for the fields
        // ...
    }

    class ImperialData {
        public double getValue() {
			return value;
		}
		public String getUnit() {
			return unit;
		}
		public int getUnitType() {
			return unitType;
		}
		@JsonProperty("Value")
		private double value;
		@JsonProperty("Unit")
        private String unit;
		@JsonProperty("UnitType")
        private int unitType;
        
        // Getters and setters for the fields
        // ...
    }
