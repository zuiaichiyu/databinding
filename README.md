# databinding demo

Two ways binding data:

1. custom model extends BaseObservable
   add @Bindable for getter methods
   add notifyPropertyChanged(propertyName) for setter methods.
   
   
2. wrap properties with ObservableField<T> ,and have to be prefix with **public final** and with *NO** getter and setter methods,for example:
  
  public final ObservableField<String> name = new ObservableField();
