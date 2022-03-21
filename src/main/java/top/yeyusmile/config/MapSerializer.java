//package top.yeyusmile.config;
//
//import com.fasterxml.jackson.databind.BeanProperty;
//import com.fasterxml.jackson.databind.JavaType;
//import com.fasterxml.jackson.databind.JsonSerializer;
//import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
//import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
//
//import java.util.Set;
//
///**
// * @author 夜雨
// * @Web www.yeyusmile.top
// * @date 2022/3/21 17:16
// */
//@JacksonStdImpl
//public class MapSerializer extends com.fasterxml.jackson.databind.ser.std.MapSerializer {
//    protected MapSerializer(Set<String> ignoredEntries, JavaType keyType, JavaType valueType, boolean valueTypeIsStatic, TypeSerializer vts, JsonSerializer<?> keySerializer, JsonSerializer<?> valueSerializer) {
//        super(ignoredEntries, keyType, valueType, valueTypeIsStatic, vts, keySerializer, valueSerializer);
//    }
//
//    protected MapSerializer(com.fasterxml.jackson.databind.ser.std.MapSerializer src, BeanProperty property, JsonSerializer<?> keySerializer, JsonSerializer<?> valueSerializer, Set<String> ignoredEntries) {
//        super(src, property, keySerializer, valueSerializer, ignoredEntries);
//    }
//
//    protected MapSerializer(com.fasterxml.jackson.databind.ser.std.MapSerializer src, TypeSerializer vts, Object suppressableValue, boolean suppressNulls) {
//        super(src, vts, suppressableValue, suppressNulls);
//    }
//
//    protected MapSerializer(com.fasterxml.jackson.databind.ser.std.MapSerializer src, Object filterId, boolean sortKeys) {
//        super(src, filterId, sortKeys);
//    }
//}
