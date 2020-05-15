# coding: utf-8

from __future__ import absolute_import
import unittest

from flask import json
from six import BytesIO

from openapi_server.models.inline_response2007 import InlineResponse2007  # noqa: E501
from openapi_server.models.inline_response500 import InlineResponse500  # noqa: E501
from openapi_server.models.yara_sources_object import YaraSourcesObject  # noqa: E501
from openapi_server.test import BaseTestCase


class TestYaraController(BaseTestCase):
    """YaraController integration test stubs"""

    def test_yara_package_generate(self):
        """Test case for yara_package_generate

        Generate Yara package
        """
        headers = { 
            'Accept': 'application/json',
            'apikey': 'apikey_example',
            'apikey': 'special-key',
        }
        response = self.client.open(
            '/yara/generate',
            method='PUT',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_yara_package_status(self):
        """Test case for yara_package_status

        Yara Generation Status
        """
        headers = { 
            'Accept': 'application/json',
            'apikey': 'apikey_example',
            'apikey': 'special-key',
        }
        response = self.client.open(
            '/yara/package',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_yara_sources_get(self):
        """Test case for yara_sources_get

        Get Yara sources
        """
        headers = { 
            'Accept': 'application/json',
            'apikey': 'apikey_example',
            'apikey': 'special-key',
        }
        response = self.client.open(
            '/admin/config/yara/sources',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_yara_sources_put(self):
        """Test case for yara_sources_put

        Modify Yara sources
        """
        yara_sources_object = {
  "http_sources" : [ {
    "source" : "http://onlineyarasources.net/source.zip",
    "state" : "disabled"
  }, {
    "source" : "http://onlineyarasources.net/source.zip",
    "state" : "disabled"
  } ],
  "local_sources" : [ {
    "source" : "/mnt/yara",
    "state" : "enabled"
  }, {
    "source" : "/mnt/yara",
    "state" : "enabled"
  } ]
}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'apikey': 'apikey_example',
            'apikey': 'special-key',
        }
        response = self.client.open(
            '/admin/config/yara/sources',
            method='PUT',
            headers=headers,
            data=json.dumps(yara_sources_object),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
