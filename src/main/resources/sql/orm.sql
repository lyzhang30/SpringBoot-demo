/*
 Navicat Premium Data Transfer

 Source Server         : localhost_3306
 Source Server Type    : MySQL
 Source Server Version : 80029
 Source Host           : localhost:3306
 Source Schema         : orm

 Target Server Type    : MySQL
 Target Server Version : 80029
 File Encoding         : 65001

 Date: 21/11/2022 10:40:30
*/
DROP DATABASE IF EXISTS `orm`;
CREATE DATABASE `orm`;
USE `orm`;
SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for course
-- ----------------------------
DROP TABLE IF EXISTS `course`;
CREATE TABLE `course`  (
  `cid` bigint(0) NOT NULL AUTO_INCREMENT,
  `cname` varchar(40) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL,
  PRIMARY KEY (`cid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of course
-- ----------------------------
INSERT INTO `course` VALUES (1, 'Java从入门到放弃');
INSERT INTO `course` VALUES (2, '重学设计模式');

-- ----------------------------
-- Table structure for score
-- ----------------------------
DROP TABLE IF EXISTS `score`;
CREATE TABLE `score`  (
  `sid` bigint(0) NOT NULL,
  `cid` bigint(0) NOT NULL,
  `result` double NULL DEFAULT 0,
  PRIMARY KEY (`sid`, `cid`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of score
-- ----------------------------
INSERT INTO `score` VALUES (1, 1, 60);
INSERT INTO `score` VALUES (2, 1, 59);
INSERT INTO `score` VALUES (3, 2, 88);

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student`  (
  `sid` bigint(0) NOT NULL AUTO_INCREMENT,
  `s_name` varchar(40) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL,
  `sex` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL,
  `age` int(0) NULL DEFAULT NULL,
  PRIMARY KEY (`sid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 57 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES (2, '李四', 'M', 20);
INSERT INTO `student` VALUES (3, '王五', 'F', 24);
INSERT INTO `student` VALUES (4, '大勇', 'M', 10);
INSERT INTO `student` VALUES (30, '大勇', 'M', 10);
INSERT INTO `student` VALUES (50, '大勇', 'M', 10);
INSERT INTO `student` VALUES (51, '大勇', 'M', 10);
INSERT INTO `student` VALUES (52, '大勇', 'M', 10);
INSERT INTO `student` VALUES (53, '大勇', 'M', 10);
INSERT INTO `student` VALUES (54, '大勇', 'M', 10);
INSERT INTO `student` VALUES (55, '大勇', 'M', 10);
INSERT INTO `student` VALUES (56, '大勇', 'M', 10);
INSERT INTO `student` VALUES (57, '大勇', 'M', 10);
INSERT INTO `student` VALUES (58, '大勇', 'M', 10);

SET FOREIGN_KEY_CHECKS = 1;
